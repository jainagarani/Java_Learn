package Examples.LambdaBasics;

public class ThisReferenceExample {
    public static void main(String[] args){
        int a=10;
        int b= 20;

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(a, new Process(){

            @Override
            public void process(int i) {
                System.out.println("i is"+i);
                System.out.println(this);

            }
        });

        thisReferenceExample.doProcess(a, num-> {
            System.out.println(num);
           // System.out.println(this);

        });

        System.out.println("This reference Example");
        thisReferenceExample.execute();

    }
    public  void doProcess(int i, Process p){
        p.process(i);

    }

    public void execute(){
        System.out.println(this);
        doProcess(10, num-> {
            System.out.println(num);
            System.out.println(this);

        });
    }
}

