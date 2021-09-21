package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main (String[] args) {
        System.out.println(">>> line 1");

        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("multiply by 2 - " + i);
            return i * 2;
        });

        System.out.println(">>> line 2");

        int result = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("multiply by 2 - " + i);
            return i * 2;
        }).max().getAsInt();

        System.out.println("result = " + result);

      List<Integer> list=  Arrays.asList(new Integer(1),
                new Integer(2),new Integer(3));

        list.stream()
                .map(i -> {
            System.out.println("multiply by 2 - " + i);
            return i * 2;
        }).collect(Collectors.toList()).forEach(System.out::println);



    }

}
