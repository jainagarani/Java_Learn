package basics;

public class FibonacciExample implements Cloneable {
    public static int fibonacci(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i =2; i <=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static int fibonacciTest(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] =1;
        for(int i =2; i<=n; i++){
            fib[i] = fib[i-1]+ fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args){


        FibonacciExample fibonacciExample = new FibonacciExample();
       System.out.println(" fib +"+ fibonacciTest(7));

    }
}
