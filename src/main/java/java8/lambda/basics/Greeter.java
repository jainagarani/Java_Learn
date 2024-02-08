package java8.lambda.basics;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        Greeting greeting = ()-> System.out.println("Hello World");
        greeting.perform();
        AdditionInterface additionInterface = (a,b) -> a+b;
    }
}
