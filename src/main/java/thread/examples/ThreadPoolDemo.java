package thread.examples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(()-> {System.out.println("in run method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        while(!executorService.isTerminated()){
            System.out.println("in Not Terminated");
        }
        System.out.println("The program ends");
    }
}
