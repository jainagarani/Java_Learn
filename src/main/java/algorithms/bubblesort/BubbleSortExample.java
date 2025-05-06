package algorithms.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortExample {
    public static void main(String[] args){
      /*  int[] arr = {5,6,4,8,9};
        for(int i =0; i < arr.length-1; i++){
          for(int j =i+1; j<arr.length;j++){
            if(arr[i] >arr[j]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
          }

        }
        Arrays.stream(arr).forEach(System.out::print);*/
        int[] arr = {10,3,5,6};
        for(int i=0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                 }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
