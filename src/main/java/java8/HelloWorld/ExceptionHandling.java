package java8.HelloWorld;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        process(arr,0, wrapperLambda((i,k)-> System.out.println(i / k)));


    }
    private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer){
        for(int i :arr){

                consumer.accept(i, key);

        }
    }
    private static BiConsumer<Integer, Integer> wrapperLambda( BiConsumer<Integer, Integer> consumer){
      return (a,b)-> {
          try{
              consumer.accept(a, b);
          }
          catch(ArithmeticException arithmeticException){
              System.out.println("Arithmetic Exception");
          }


      };
    }

}
