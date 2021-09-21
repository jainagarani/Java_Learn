package interview;

public class Example3 implements Runnable{

    int[] arr;
    int data;
    public Example3(int[] arr, int data){
        this.arr = arr;
        this.data = data;
    }

    @Override
    public void run() {
        linearSearch(arr,data);

    }

    public int linearSearch(int[] arr, int data){
        int index = -1;
        for(int i = 0; i<arr.length; i++){
            if(data == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println("In Linear Search"+index);
        return index;
    }


    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1,2, 3, 4, 6, 8, 9};

        Example3 example3 = new Example3(arr,4);
        Example4 example4 = new Example4(arr, 8);
        Thread t1 = new Thread(example3);
        t1.start();
        Thread t2 = new Thread(example4);
        t2.start();





    }

}
