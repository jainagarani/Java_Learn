package java8.basics2023.interfaceExamples.basic;

public class InterfaceExample {
    public static void main(String[] args){
        TestClass testClass = new TestClass();
        testClass.nonstaticPrint("TestClass::nonstaticPrint()");
        TestInterface.print();
        TestInterface2.print("Jai");
        System.out.println(testClass.cube(5));
        testClass.showNum(10);


    }
}
