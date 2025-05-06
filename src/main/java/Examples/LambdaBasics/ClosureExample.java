package Examples.LambdaBasics;

public class ClosureExample {
    public static void main(String[] args){
        int a=10;
        int b= 20;
        doProcess(a,num-> System.out.println(num+b));

    }
    public static void doProcess(int i, Process p){
        p.process(i);

    }
}

interface Process{
    void process(int i);
}
