package interview;

import java.io.IOException;
import java.util.Arrays;

public class SampleExample {

    public static void main(String[] args){
      String s= "a1b1c3";
      String[] arr =s.split("\\d");
        Arrays.stream(arr).forEach(System.out::println);
int i = sum();
System.out.println(i);

    }

     static int sum(){
         try{
            throw new IOException();


         }
         catch (Exception e){
             System.out.println("catch");
             return 2;
         }
         finally {

             System.out.println("finally");
             return 3;
         }


    }

    static void sum(float n, float n2){
        System.out.println("float");

    }
}
