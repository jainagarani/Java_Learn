package Examples.LambdaBasics;

public class MethodReferenceExample {

    public static void main(String args[]){
        Thread thread = new Thread(MethodReferenceExample::printMessage);
        thread.start();

    }

    public static void printMessage(){
        System.out.println("Hello ");
    }
}


