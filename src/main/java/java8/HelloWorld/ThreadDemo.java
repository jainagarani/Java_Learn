package java8.HelloWorld;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread.sleep(100);
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.setPriority(10);
        myThread1.start();

        Thread.sleep(100);


        Thread threadRunnable = new Thread(()->System.out.println("In runnable run method"));
        threadRunnable.start();
        myThread.join();
        System.out.println("main thread exit");

    }
}

class MyThread extends Thread{

    public void run(){

            for(int i =1;i <5; i++){
                try {
                Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("in child thread exception "+i);
                }
                System.out.println("in child thread "+i +" :"+Thread.currentThread().getName());
                System.out.println("in child thread "+i +" :"+Thread.currentThread().getPriority());
            }


        System.out.println("In Child exit");
    }


}
