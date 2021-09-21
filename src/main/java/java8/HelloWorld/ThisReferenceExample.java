package java8.HelloWorld;

public class ThisReferenceExample {
    private  void doProcess(int i, Process process){
             process.process(i);
    }

    public static void main(String[] args){
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(5, new Process() {
            @Override
            public void process(int a) {
                System.out.println(a);
                System.out.println(this);
            }
            @Override
            public String toString(){
                return "annonymous inner class";

            }
        });
    }
}
