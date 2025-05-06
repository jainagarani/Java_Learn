package basics.threadsBasic;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args)  {
        Task task = new Task ("welcome");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> result = executorService.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}

class Task implements Callable<String>{
    private String message;

    public Task(String message){
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        return message;
    }
}
