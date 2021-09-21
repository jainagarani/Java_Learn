package thread.examples;

public class ThreadExample {


    public static void main(String[] args){
        Worker worker = new Worker("task1");
        Thread runThread = new Thread(worker);
        runThread.start();

        Task task = new Task("Task2");
        task.start();

    }

}
