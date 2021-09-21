package java8.HelloWorld;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args){
        String[] str = {"ABC","john", "Alex", "jai"};
        Stream stream = Arrays.stream(str);

        stream.sorted((e1,e2) -> e2.toString().compareTo(e1.toString())).
                forEach(System.out::println);
       System.out.println(" ***** ");
        Supplier<Stream<String>> supplier =() ->Stream.of("ABC","john", "Alex", "jai");
       // Supplier<Stream<String>> supplier =() -> (Supplier<Stream>) stream;
        supplier.get().forEach(System.out::println);
        supplier.get().filter(e -> e.toString().contains("a")).forEach(System.out::println);
       /*stream.forEach(System.out::println);
        stream.filter(e -> e.toString().contains("a")).forEach( System.out::println);*/

    }
}
