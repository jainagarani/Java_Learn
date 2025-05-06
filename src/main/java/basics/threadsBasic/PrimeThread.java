package basics.threadsBasic;

public class PrimeThread extends Thread{

    int minPrime;

    PrimeThread(int minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        System.out.println("In run method");
        boolean isFound = false;

            for (int i = minPrime+1; i <100 ;i++){
                System.out.println("i "+i);
               int j =2;

               while (!isFound || j<=i){
                    if(j <i && i%j == 0){
                        System.out.println("J "+j);

                        break;

                    }else if(j ==i && i%j ==0){
                        isFound = true;
                        System.out.println("prime number found"+i);
                        break;
                    }
                   j++;
                }
               if(isFound){
                   break;
               }
        }

    }


}
