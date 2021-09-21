package preparation;

import java.util.Arrays;

public class QuickSortExample {
    public void quickSort(int[] arr, int begin, int end){
        int pivot = end-begin/2;
        if(begin <end){

            for(int i= begin; i<end; i++){
                if(arr[i] > arr[pivot]){
                    int temp = arr[i];
                     arr[i] = arr[pivot];
                     arr[pivot] = temp;
                }
            }

            quickSort(arr, begin,pivot-1);
            quickSort(arr, pivot+1,end);


        }


    }

    public static void main(String[] args){
        QuickSortExample quickSortExample = new QuickSortExample();
        int[] arr = {1,7, 8,6,4,3,5,2,9};
        quickSortExample.quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);

    }
}
