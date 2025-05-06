package java8;



import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        Stream<String> stream1 = Stream.empty();
        stream1.forEach(e-> System.out.println(e));


        Stream<String> stream2 = Stream.of("one","Two", "Three");
        //stream2.forEach(e-> System.out.println(e));

        List<String> list = Arrays.asList("One", "Two", "Three");
        Stream<String> stream3 = list.stream();
        //stream3.forEach(e-> System.out.println(e));

        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream4 = Arrays.stream(arr,0,2);
        //stream4.forEach(e-> System.out.println(e));

        Stream<String> streamBuilder = Stream.<String>builder().add("A").add("B").add("C").build();
       // streamBuilder.forEach(e-> System.out.println(e));

       Stream<String> generated = Stream.generate(()->"element").limit(5);
       // generated.forEach(e-> System.out.println(e));

        Stream<Integer> iterated = Stream.iterate(5, n->n+1).limit(4);
         iterated.forEach(e-> System.out.println(e));

        IntStream intStream = IntStream.rangeClosed(1,4).limit(4);
        //intStream.forEach(System.out::println);

        Random random = new Random();
        DoubleStream dstream = random.doubles(3);
        //dstream.forEach(System.out::println);

        IntStream streamOfChars = "abc".chars();
       // streamOfChars.forEach(System.out::println);

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
       // streamOfString.forEach(System.out::println);

        Path path = Paths.get("C://Java//file.txt");
        Stream<String> strStream = Files.lines(path);
        Stream<String> strStream1 = Files.lines(path, Charset.forName("UTF-8"));
       // strStream.forEach(System.out::println);
       // strStream1.forEach(System.out::println);

        Stream stream = Stream.of("Mike", "Musk", "Sundar", "Sudar").filter(e-> e.startsWith("S"));
        Optional<String> nameOp = stream.findAny();
       // System.out.println("nameOP "+(nameOp.isPresent()?nameOp.get():null));

        //Optional<String> nameOp1 = stream.findFirst(); //IllegalStateException

        Stream<String> onceModifiedStream = Stream.of("abcd", "bdef", "xyza").skip(1);

        List<String> list1 = onceModifiedStream.map(e -> e.substring(0,3)).sorted().collect(Collectors.toList());

        //list1.forEach(e-> System.out.println(e));

        int sum = Stream.of(1, 2, 3).parallel().reduce(10,(a, b)-> a + b, (a, b)->{
            System.out.println("Combiner was called");
            return a + b;
        });

        System.out.println("sum is"+sum);

    }
}
