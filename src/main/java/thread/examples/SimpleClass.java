package thread.examples;

public class SimpleClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World from "+Thread.currentThread().getName());
        for(int i=1 ; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
            t.join();
        }

    }
}
