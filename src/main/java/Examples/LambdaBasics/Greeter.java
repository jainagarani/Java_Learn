package Examples.LambdaBasics;

public class Greeter {
    public void greet(){
        System.out.println("Greet");
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}
