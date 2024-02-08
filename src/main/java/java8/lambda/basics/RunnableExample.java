package java8.lambda.basics;

public class RunnableExample {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run method");
            }
        });
        thread.start();

        Thread lambdaThread = new Thread(()-> System.out.println("Inside Lambda run method"));
        lambdaThread.start();
    }
}
