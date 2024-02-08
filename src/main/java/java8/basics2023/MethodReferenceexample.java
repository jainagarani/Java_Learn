package java8.basics2023;

public class MethodReferenceexample {

    public static void main(String[] args){
        Thread thread = new Thread(MethodReferenceexample::printMessage );
        thread.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
