package basics.threadsBasic;

class SharedResource implements Runnable{
    static int count;
    int limit;
    int reminder;

     static Object lock = new Object();


    SharedResource(int limit, int reminder){
        this.limit = limit;
        this.reminder = reminder;
        count = 1;
    }

   public void print(){

            System.out.println(Thread.currentThread().getName()+" :"+count++);

   }


    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < limit; i++) {
                if (count % 2 != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                print();
                lock.notifyAll();
            }
       }
    }
}

public class OddEvenNumberPrinter {

    public static void main(String[] args){

        Thread oddNumberThread = new Thread(new SharedResource(5,1),"OddNumber");
        Thread evenNumberThread = new Thread(new SharedResource(5, 0),"EvenNumber");

        oddNumberThread.start();
        evenNumberThread.start();

    }
}
