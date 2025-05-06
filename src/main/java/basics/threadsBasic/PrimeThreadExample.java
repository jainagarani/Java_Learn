package basics.threadsBasic;

public class PrimeThreadExample {
    public static void main(String[] args){
        PrimeThread primeThread = new PrimeThread(3);
       // primeThread.start();

        PrimeRun primeRun = new PrimeRun(3);
        new Thread(primeRun).start();
    }
}
