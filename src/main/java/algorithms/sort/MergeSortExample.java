package algorithms.sort;

import java.util.Arrays;

/*
Big O of(nlogn)
 */
public class MergeSortExample {
    public static void main(String[] args){
        int[] arr = {2,4,1,6,8,5,3,7};
        MergeSortExample mergeSortExample = new MergeSortExample();
        mergeSortExample.mergeSort(arr);
        Arrays.stream(arr).forEach(n-> System.out.print(n+","));
    }

    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n<2) return;
        int mid = n/2;

       int k =0;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n-mid];
        for(int i=0; i< mid; i++, k++ ){
            leftArr[i] = arr[i];
         }
        for(int i=mid; i< n; i++, k++){
            rightArr[i-mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr );
        merge(leftArr,rightArr, arr);
    }

    public void merge(int[] leftArr, int[] rightArr, int[] arr
                       ){
        int i =0,j=0,k=0;
        int leftArrLen = leftArr.length;
        int rightArrLen = rightArr.length;
        while(i < leftArrLen && j <rightArrLen){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i = i+1;
            }else{
                arr[k] = rightArr[j];
                j = j+1;
            }
            k = k+1;
        }
        while(i <leftArrLen){
            arr[k] = leftArr[i];
            i = i+1;
            k = k+1;
        }
        while(j <rightArrLen){
            arr[k] = rightArr[j];
            j = j+1;
            k = k+1;
        }
    }
}
