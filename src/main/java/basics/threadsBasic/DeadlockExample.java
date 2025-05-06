package basics.threadsBasic;

public class DeadlockExample {


    public static void main(String[] args){
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";

        Thread t1 = new Thread(()->
        {
            synchronized (resource1){
                System.out.println("thread1 locking resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2){
                    System.out.println("thread1 locking resource2");
                }
            }
        });

        Thread t2 = new Thread(()->
        {
            synchronized (resource2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1){
                    System.out.println("thread2 locking resource1");
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of main");
    }
}
