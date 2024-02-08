package algorithms;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr, int begin, int end){
        if(begin < end){
            int pivot = end -begin/2;
            for(int i =begin; i<end; i++){
                if(arr[i]>arr[pivot]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                }
            }

            quickSort(arr,begin,pivot-1);
            quickSort(arr,pivot+1,end);

        }
    }

    public void quickSort1(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivot = end - begin / 2;
            for (int i = begin; i < end; i++) {
                if (arr[i] > arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                }

            }
            quickSort1(arr, begin, pivot - 1);

            quickSort1(arr, pivot + 1, end);

        }
    }
    public static void main(String[] args){
        int[] arr = {4,5 , 7, 8 , 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort1(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);


    }
}
