package interview;

/*
Rotate an integer array
    input 1,2,3,4,5
	rotationFactor - 2
	output - 4,5,1,2,3
input - 1,2,3,4,5
rotationFactor - 1
output - 5,1,2,3,4

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateAnArray {

    public void rotate(int[] arr, int key){
        int length = arr.length;
        int j = length-1;
        int pivot = j;
        int count =1;
        while(count != key){
            j = j-1;
            count = count+1;
        }
       int[] temp = new int[length];
        int i =0;
        for(;j<arr.length; j++,i++){
            temp[i]    = arr[j]  ;
        }
        for(int k =0;i<=pivot; k++,i++){
            temp[i]    = arr[k]  ;
        }
        Arrays.stream(temp).forEach(System.out::println);



    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        RotateAnArray rotateAnArray = new RotateAnArray();
        rotateAnArray.rotate(arr,2);


    }
}
