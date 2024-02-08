package java8.lambda.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionHandlingExample {
    public static void main(String[] args){
      //  int[] numbers = {1,2,3,4,5};
        int key = 0;
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        List<Integer> newList =numberList.stream().map(e->
                {
                    try {
                      e= e / key;
                    } catch (ArithmeticException ae) {
                        System.out.println("exception");

                    }
                    return e;
                }

        ).collect(Collectors.toList());
        newList.stream().forEach(e-> System.out.println(e));

    }
}
