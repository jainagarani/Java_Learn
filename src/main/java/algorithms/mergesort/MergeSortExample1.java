package algorithms.mergesort;

import java.util.Arrays;

public class MergeSortExample1 {

    public void merge(int[] arr, int begin, int end, int mid){
        int length1 = mid-begin +1;
        int length2 = end -mid;
        int[] leftArr = new int[length1];
        int[] rightArr = new int[length2];

        for(int i =0; i< length1; i++){
            leftArr[i] = arr[begin+i];
        }

        for(int j =0; j< length2; j++){
            rightArr[j] = arr[mid+1+j];
        }

        int i =0, j =0;
        int k = begin;
        for(;i<length1 && j<length2;){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                k++;
                i++;
            }else{
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while(i <length1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < length2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr, int begin, int end){
        if (begin >= end) {
            return;
        }
        else{
            int mid = (begin+end)/2;
            mergeSort(arr, begin,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,begin,end,mid);
        }
    }

    public static void main(String[] args){
        MergeSortExample1 mergeSortExample1 = new MergeSortExample1();
        int[] arr = {4,1 , 7, 8 , 5};
        mergeSortExample1.mergeSort(arr, 0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);

    }
}
