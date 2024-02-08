package thread.examples;

public class HelloWorldPrinter implements  Runnable{
    @Override
    public void run() {
        System.out.println("HelloWorld from HelloworldPrinter"+Thread.currentThread().getName());
    }
}
