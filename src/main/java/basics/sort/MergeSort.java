package basics.sort;

import algorithms.sort.MergeSortExample;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] arr = {2,4,1,6,8,5,3,7};
       MergeSort mergeSort = new MergeSort();
       mergeSort.mergeSort(arr);
        Arrays.stream(arr).forEach(n-> System.out.print(n+","));
    }

    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2) return;
        int mid = arr.length/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n-mid];

        for(int i =0; i< mid; i++){
            leftArr[i] = arr[i];
        }

        for(int i=mid; i <n; i++){
            rightArr[i-mid] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    public void merge(int[] arr, int[] leftArr, int[] rightArr){
        int k =0, i=0, j=0;
        int lenLeftArray = leftArr.length;
        int lenRightArray = rightArr.length;
       while( i < lenLeftArray && j < lenRightArray){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i = i+1;
            }
            else{
                arr[k] =  rightArr[j];
                j = j+1;

            }
            k = k+1;
        }

        while(i < lenLeftArray){
            arr[k] = leftArr[i];
            k= k+1;
            i = i+1;
        }

        while(i < lenRightArray){
            arr[k] = rightArr[i];
            k= k+1;
            i = i+1;
        }

    }
}
