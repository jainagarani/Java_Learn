package java8.HelloWorld;

public class WorkerThread implements Runnable{
    private String name;
    public WorkerThread(String name){
        this.name = name;

    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Started");
        doProcess();
        System.out.println(Thread.currentThread().getName()+" ended");
    }

    public void doProcess(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
