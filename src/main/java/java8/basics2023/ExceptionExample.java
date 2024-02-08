package java8.basics2023;

import java.util.function.BiConsumer;

public class ExceptionExample {

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        process(arr,0,lambdaWrapper((k,v)-> System.out.println(k/v)));

    }

    public static  BiConsumer<Integer, Integer> lambdaWrapper(BiConsumer<Integer, Integer> biConsumer){
       return (k,v) -> {
        try{
            biConsumer.accept(k, v);
        }
          catch(ArithmeticException ae) {
            System.out.println("Exception caught in wrapper Lambda");
          }
       };
    }

    public static void process(int[] arr , int key, BiConsumer<Integer, Integer> biConsumer){
        for(int n: arr){
            biConsumer.accept(n, key);
        }

    }
}
