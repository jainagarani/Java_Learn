package programs;

import java.util.Arrays;
import java.util.Stack;
/*
Move zero to right
 */


public class MoveZeroToRight {

    public void moveArrayToRight(int[] arr){
        int count = 0;
        int length = arr.length;

        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count = count+1;
            }
        }

        while(count < length){
            arr[count] = 0;
            count = count+1;
        }
        Arrays.stream(arr).forEach(System.out::print);





    }
    public static void main(String[] args){
        int[] arr = {1,0,3,5,6,9,0};
       new MoveZeroToRight().moveArrayToRight(arr);

    }
}
