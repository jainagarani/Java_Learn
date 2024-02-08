package basics.sort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr, int begin, int end){
        if(begin < end){
            int pivot = end- begin/2;
            for(int i = begin; i <= end; i++){
                if(arr[i] > arr[pivot]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                }
            }
            quickSort(arr, begin, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();
        int[] arr = {1,9,10,5,4,3};
        quickSort.quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
