package interview.walmart;

import java.util.ArrayList;
import java.util.List;

/*
0, 1, 1, 2, 3, 5, 8 …..
f(6) = 8

 */
public class Sample {

    public static int findFibonacci(int n){
        int num1 =0;
        int num2 =1;
        int sum = 0;
        int i =2;

        if(n== 0){
            return num1;
        }
        if(n== 1 || n ==2){
            return num2;
        }

        while (i <= n){
                sum = num1+num2;
                num1 = num2;
                num2 = sum;
                i = i +1;
        }
        return sum;
    }

    public static List<Integer> findFibonacciPrint(int n){
        int num1 =0;
        int num2 =1;
        int sum = 0;
        int i =2;

        List<Integer> list = new ArrayList<>();

        if(n== 0){
            list.add(num1);
            return list;

        }
        if(n== 1 ){
            list.add(num2);
            return list;
        }
        list.add(num1);
        list.add(num2);

        while (i <= n){
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            i = i +1;
            list.add(sum);
        }
        return list;
    }


    public static void main(String[] args){
      List<Integer> list = Sample.findFibonacciPrint(6);
      list.forEach(System.out::print);
    }
}
