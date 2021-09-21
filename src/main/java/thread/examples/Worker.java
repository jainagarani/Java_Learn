package thread.examples;

public class Worker implements Runnable{
    String name;

    public Worker(String name){
        this.name = name;

    }
    @Override
    public void run() {
        System.out.println("In Run method" +Thread.currentThread().getName());
    }
}
