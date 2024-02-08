package java8.inter;

public class InterfaceExample implements interface1, interface2{


    @Override
    public void log(String str) {
       interface1.super.log(str);
    }

    @Override
    public void method2() {

    }

    public static void main(String[] args){
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.log("Java");
        interface2.print("Hello World");

    }
}
