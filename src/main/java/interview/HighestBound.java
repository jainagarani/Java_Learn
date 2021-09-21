package interview;
/*
coding problem:// Given a list of digits and a higher bound, build the highest number you
        can from those digits that is smaller than or equal to the higher bound. //
        Examples:
// * Digits: 8, 7, 1; higher bound: "1000"
// * Answer: "871"
// * Digits: 8, 7, 1; higher bound: "200"
// * Answer: "187"

 */

import java.util.Arrays;

public class HighestBound {

    public void findHigherBound(int[] arr, int higherBound){
        int length = arr.length;
        int digits = findDigits(higherBound);
        System.out.println("digits"+digits);
        if(digits > length){
            for(int i =0; i<arr.length;i++){
                for(int j =i+1;j<arr.length;j++){
                    if(arr[i] <arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            Arrays.stream(arr).forEach(System.out::print);


        }else{
           String number =  String.valueOf(higherBound);
           String result ="";
           for(int i =0; i<number.length(); i++){
              int num =  number.charAt(i)-48;
               for(int j =0; j<arr.length;j++){
                   if(arr[j] <num & arr[j] != -1){
                       result += arr[j];
                       arr[j] =-1;
                        for(int k =0; k<arr.length;k++) {
                            if(arr[k] != -1)   {
                                  result += arr[k];
                            }
                        }
                        break;

                   }
               }

           }
           System.out.println("resul" +result
                   );


        }

    }

    public int findDigits(int higherBound){
        int temp = higherBound;
        int count = 0;
        while(temp > 0){
            temp = temp/10;
            count = count +1;

        }
        return count;
    }
    public int[] findNumbers(int higherBound, int digits){
        int temp = higherBound;
        int count = 0;
        int i =0;
        int[] arr = new int[digits];
        while(temp%10 <0){
           int number = temp%10;
           arr[i] = number;
                   temp = temp/10;


        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {8,7,1};
        new HighestBound().findHigherBound(arr, 200);
    }
}
