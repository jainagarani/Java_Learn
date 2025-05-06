package basics.threadsBasic;

import java.util.LinkedList;

class SharedBuffer{
    private final int capacity;
    private final LinkedList<Integer> buffer;

    public SharedBuffer(int capacity){
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public  synchronized void produce(int item) throws InterruptedException {
        if(this.buffer.size() == capacity){
            wait();
        }
        this.buffer.add(item);
        System.out.println("Produced Item");
        notifyAll();
    }

    public  synchronized int consume() throws InterruptedException {
        if(this.buffer.isEmpty()){
            wait();
        }
       int item = this.buffer.remove();
        System.out.println("consumed Item");
        notifyAll();
        return  item;
    }
}

class Producer implements  Runnable{
    private final SharedBuffer sharedBuffer;

    Producer( SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for(int i= 1; i<=5; i++){
            try {
                sharedBuffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Consumer implements Runnable{
    private final SharedBuffer sharedBuffer;

    Consumer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for(int i =1; i<=5; i++){
            try {
              int item =  sharedBuffer.consume();
              Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {

    public static void main(String[] args){
        SharedBuffer sharedBuffer = new SharedBuffer(3);
        Thread producer = new Thread(new Producer(sharedBuffer));
        Thread consumer = new Thread(new Consumer(sharedBuffer));
        producer.start();
        consumer.start();
    }
}
