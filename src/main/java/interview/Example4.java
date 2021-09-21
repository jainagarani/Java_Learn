package interview;

import java.util.concurrent.Callable;

public class Example4 implements Runnable {
    int[] arr;
    int data;
    public Example4(int[] arr, int data){
        this.arr = arr;
        this.data = data;
    }



    public void binarySearch(int[] arr, int data){
        System.out.println(binarySearchUtil(arr,data,0,arr.length-1));

    }

    public int binarySearchUtil(int[] arr, int data, int begin, int end){
        int index = -1;
        // int length = arr.length;

        while(begin<= end){
            int mid = (end - begin)/2 + begin;
            if(data == arr[mid]){
                index = mid;
                System.out.println("In Binary Search"+index);
                return index;
            }
            else if(data <arr[mid]){
                end = mid-1;

            }else{
              begin = mid+1;
            }

        }
        return index;
    }




    @Override
    public void run() {
        binarySearch(arr,data);

    }
}
