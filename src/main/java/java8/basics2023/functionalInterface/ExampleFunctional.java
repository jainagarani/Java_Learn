package java8.basics2023.functionalInterface;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFunctional {
    public static void main(String[] args){
        ExampleFunctional exampleFunctional = new ExampleFunctional();
        /* Predicate */
        List<String> names = Arrays.asList("Jai", "Naga", "Rani");
        List<String> nameList = names.stream().filter(s-> s.startsWith("R")).collect(Collectors.toList());
        nameList.forEach(e-> System.out.println(e));
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int num = numbers.stream().reduce(1, Integer::max);
        int num2 = numbers.stream().mapToInt( x -> x).sum();
        long num1 = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println("num "+num);
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
        int[] fibArray = {0,1};
        /* supplier */
       /* Stream<Integer> fibonacci = Stream.generate(()-> {
            int result = fibArray[1];
            int fib3 = fibArray[0] + fibArray[1];
            fibArray[0] = fibArray[1];
            fibArray[1] = fib3;
            return  result;
        });*/


       // fibonacci.forEach(num -> System.out.println("fibonacci "+num));
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.computeIfAbsent("John", s-> s.length());
        nameMap.getOrDefault("John",0);
       System.out.println("John"+ nameMap.get("John"));

       Integer value = nameMap.computeIfAbsent("Jai", String::length);
       System.out.println("value is"+value);
       Function<Integer, String> intToString = Object::toString;
       Function<String, String> quote = s-> "'"+s+"'";
       Function<Integer, String>  quoteIntToString = quote.compose(intToString);
       System.out.println(quoteIntToString.apply(5));
       short[] array = {(short)1, (short)2, (short)3};
       byte[] result = exampleFunctional.transformShortArrayToByte(array,n -> (byte)(2*n));
        for(int i =0; i <result.length; i++){
            System.out.println(result[i]);
        }



    }

    public byte[] transformShortArrayToByte(short[] array, ShortToByteFunction function){
        byte[] transformedArray = new byte[array.length];
        for(int i =0; i < array.length; i++){
           transformedArray[i] = function.applyAsByte(array[i]);
        }
        return transformedArray;
    }
}
