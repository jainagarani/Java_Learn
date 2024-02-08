package algorithms.sort;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args){
        int[] arr = {1,5,7, 3, 2, 10, 8};
        QuickSortExample quickSortExample = new QuickSortExample();
        quickSortExample.doQuickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(n->System.out.print(n+","));
    }

    public void doQuickSort(int[] arr, int begin, int end){
        if(begin< end){
            int pivot =  end - begin/2;
            for(int i =0; i <pivot; i++){
                if(arr[i] > arr[pivot]){
                    int temp = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = temp;
                }
            }
            doQuickSort(arr,0,pivot-1);
            doQuickSort(arr, pivot+1, end);
        }
    }
}
