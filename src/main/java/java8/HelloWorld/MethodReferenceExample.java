package java8.HelloWorld;

public class MethodReferenceExample {
    public static void printMessage(){
        System.out.println("Hello");
    }

    public static void main(String[] args){

        Thread t = new Thread(MethodReferenceExample::printMessage);//()-> printMessage()
        t.start();
    }
}
