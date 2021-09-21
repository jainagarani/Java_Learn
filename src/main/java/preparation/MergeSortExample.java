package preparation;

import java.util.Arrays;

public class MergeSortExample {

    public void merge(int[] arr, int begin, int end,int mid){
        int size1 = mid-begin +1;
        int size2 = end-mid;
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];
        int start = begin;
        for(int i =0; i<size1; i++){
            leftArray[i] = arr[i+begin];
        }

        for(int i =0; i<size2; i++){
            rightArray[i] = arr[i+mid+1];

        }
        int i=0,j =0;
        int k = begin;

        while(i<size1 && j <size2){
            if(leftArray[i] <rightArray[j]){
                arr[k] = leftArray[i];
                i = i+1;
            }else{
                arr[k] = rightArray[j];
                j = j+1;

            }
            k = k+1;
        }
        while(i <size1){
            arr[k] = leftArray[i];
            i = i+1;
            k = k+1;
        }

        while(j<size2){
            arr[k] = rightArray[j];
            j = j+1;
            k = k+1;
        }


    }

    public void mergeSort(int[] arr, int begin, int end){
        if(begin >=end){
            return;
        }else {
            int mid =( end + begin) / 2;
            mergeSort(arr, begin, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, begin, end, mid);
        }
    }

    public static  void main(String[] args){
        int[] arr = {1,7, 8,6,4,3,5,2,9};
        MergeSortExample mergeSortExample = new MergeSortExample();
        mergeSortExample.mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);

    }
}
