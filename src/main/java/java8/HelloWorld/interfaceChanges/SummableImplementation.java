package java8.HelloWorld.interfaceChanges;

public class SummableImplementation implements Summable,Summable1{
    @Override
    public int add(int a, int b) {
        return 0;
    }

    

    @Override
    public void print() {
        Summable1.super.print();
    }

    public static void main(String[] args){
        Summable.method();
        Summable1.method();
    }


}
