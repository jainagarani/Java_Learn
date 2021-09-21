package java8.HelloWorld;

public class InterThreadCommunication {

    public static void main(String[] args){
        Customer customer = new Customer();
        Thread t1 = new Thread(()-> customer.withdraw(15000) );
        t1.start();
        Thread t2 = new Thread(()-> customer.deposit(10000) );
        t2.start();


    }
}
class Customer{
    private int totalAmount =10000;

    public synchronized void withdraw(int amount){
        if(this.totalAmount <amount){
            System.out.println("Less amount for withdrawal"+totalAmount);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        totalAmount = totalAmount-amount;
        System.out.println("Withdrawn , balance"+totalAmount);
    }

    public synchronized void deposit(int amount){
        System.out.println("Deposit ");
        totalAmount = totalAmount+amount;
        notify();
        System.out.println("deposit completed"+totalAmount);

    }
}
