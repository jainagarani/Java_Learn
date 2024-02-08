package java8.basics2023;

public class Greeter {

    public void greet(Greeting greeting){
       greeting.performGreet();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        Greeting greetingLambda = ()-> System.out.println("HELLO World !");
        greeter.greet(greetingLambda);


        Thread thread = new Thread(()-> System.out.println("In lambda run method"));
        thread.run();
        System.out.println("in thread end");

    }
}
