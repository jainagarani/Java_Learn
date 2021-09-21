package interview;


import java.util.Arrays;

//1,,3,4
//2,4,6,7
//1,2,3,4,4,6,7
public class ExampleTest1 {

    public static void main(String[] args){
        /*Printable printable = new Printable();
        Thread t1 = new Thread(printable);
        t1.start();*/
        int[] arr1 = {1,3,4,8,9};
        int[] arr2 = {2,4,6,7};
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1 +length2;
        int[] result = new int[length];
        int j =0;
        int k =0;
        int i =0;
        for(; i < arr1.length && j <length2; ){

                if(arr1[i] == arr2[j]){
                    result[k] = arr1[i];
                    k = k+1;
                    result[k] = arr2[j];
                    j = j + 1;
                    i= i+1;
                }
                else if (arr1[i] > arr2[j]) {
                    result[k] = arr2[j];
                    j = j + 1;
                } else {
                    result[k] = arr1[i];
                    i++;
                }

            k = k+1;

        }

        if(j <length2){
            for(;j<length2;j++){
                result[k] = arr2[j];
                k = k+1;
            }
        }

        if(i <length1){
            for(;i<length1;i++){
                result[k] = arr1[i];
                k = k+1;
            }
        }
        Arrays.stream(result).forEach(e -> System.out.print(e));

    }
}

class Printable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
