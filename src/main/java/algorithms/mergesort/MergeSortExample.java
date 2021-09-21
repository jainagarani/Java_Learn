package algorithms.mergesort;

import java.util.Arrays;

public class MergeSortExample {

    public void merge(int[] arr, int begin, int end,int mid){
        int size1 = mid-begin +1;
        int size2 = end-mid;
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];
        for(int i =0; i<size1 ; i++){
            leftArr[i] = arr[begin+i];
        }
        for(int j =0; j<size2 ; j++){
            rightArr[j] = arr[mid+1+j];
        }
        int i = 0, j = 0;
        int k = begin;
        while (i<size1&&j<size2)
        {
            if (leftArr[i] <= rightArr[j])
            {
                arr[k] = leftArr[i];
                i++;
            }
            else
            {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i<size1)
        {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j<size2)
        {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    public void mergeSort(int[] arr, int low, int end){
        if(low>= end)
            return;
        else{
            int mid = (low+end)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,low,end,mid);
        }
    }

    public void mergeSort1(int[] arr, int low, int end){
        if(low >= end){
            return;
        }else{
            int mid = (low+end)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1, end);
        }

    }

    public static void main(String[] args){
        MergeSortExample mergeSortExample = new MergeSortExample();
        int[] arr = {4,1,5,8,7};
        mergeSortExample.mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);


    }
}
