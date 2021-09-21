package various.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class MedianExample {

    public int findMedian(int[] arr1, int[] arr2){
        int median = -1;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr = new int[length1+length2];
        int k =0;
        int i=0,j =0;
        for(; i< arr1.length && j< arr2.length ;){

                if(arr1[i] <arr2[j]){
                    arr[k] = arr1[i];
                    i++;
                }else{
                    arr[k] = arr2[j];
                    j++;
                }
                k++;
            }
            if(i < length1){
                for(;i<arr1.length;i++,k++)
                arr[k] = arr1[i];

            }else{
                for(;j<arr2.length;j++,k++)
                arr[k] = arr2[j];

            }

        Arrays.stream(arr).forEach(e-> System.out.print(e +" "));
            if((length1+length2)%2==1){
                int middle = ((length1+length2)/2);
                median = arr[middle];
        }else{
                int middle = ((length1+length2)/2);
                median= (arr[middle-1]+arr[middle])/2;

            }
        System.out.println("<edian");
return median;

    }

    public static void main(String[] args){
        MedianExample medianExample = new MedianExample();
        int[] arr1 = {-5, 3, 6, 12, 15};
        System.out.println(arr1.length);
        int[] arr2 = {-12, -10, -6, -3, 4, 10};

       System.out.println( medianExample.findMedian(arr1, arr2));

    }
}
