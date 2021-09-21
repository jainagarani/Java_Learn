package java8.HelloWorld.interfaceChanges;

public interface Summable1 extends Summable{
    int add(int a,int b);

   public default void print(){
        System.out.println("In Summable Interface");
    }


    static void method(){
        System.out.println("In static method of Summable1");
    }
}
