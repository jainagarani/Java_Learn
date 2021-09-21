package thread.examples;

public class Task extends Thread{
    String name;
    Task(String name){
       this.name = name;
    }

    public void run(){
        System.out.println("In thread class run method "+currentThread().getName());
    }
}
