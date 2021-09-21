package java8.HelloWorld;

public class ClosureExample {
    public static void main(String[] args){
        int a=10;
        int b =20;
        doProcess(10, i -> System.out.println(i+b));



    }

    private static void doProcess(int i, Process process){
        int b = 40;
        process.process(i);
    }
}

interface Process{
    public void process(int a);
}
