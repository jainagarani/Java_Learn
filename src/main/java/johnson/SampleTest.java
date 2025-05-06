package johnson;

import java.util.Arrays;
import java.util.List;

public class SampleTest {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

       int sum = Arrays.stream(arr).filter(num -> num%2 ==0).reduce(0,(a, b) -> a+b);
       List<Integer> list= Arrays.asList(1,2,3,4);
       int value =0;


   /*     List<Integer> oddNumbers = (List<Integer>) Arrays.stream(arr).filter(e -> e%2 !=0).reduce(0(a+b))
        oddNumbers.stream().reduce(0,(a+b))*/


    }


}
