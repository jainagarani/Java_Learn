package interview;

/*
1 1 2 3 5 8 .... 12 (numbers)
fibonacci(12, 3)
1 1 2 4

 */
public class Sample {

    static boolean isAllPopulated = false;

    public void findFibonacci(int n, int k){
        int[] arr = new int[k];
            arr[0] = 1;
            arr[1] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
            for(int i = 0; i<n ; i++){
                int newSum = 0;
               // if(isAllPopulated) {
                     newSum = findSumOfElements(arr);
              //  }
                System.out.println(newSum);
                swapElements(arr, newSum);
            }



    }

    public int[] swapElements(int[] arr , int sum){
        int i=0;
        for(; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[i] = sum;
        return arr;

    }

    public int findSumOfElements(int[] arr ){
        int sum =0;
        for(int i =0; i<arr.length; i++){
           sum = sum +arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Sample sample = new Sample();
        sample.findFibonacci(5,3);

    }
}
