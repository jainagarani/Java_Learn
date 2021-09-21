package java8.HelloWorld;

public class RunnableExample {

    public static void main(String[] args){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In Runnable run");
            }
        });
        t.start();
        Thread lambdaThread = new Thread(()->System.out.println("In Lambda Runnable"));
        lambdaThread.run();
    }
}
