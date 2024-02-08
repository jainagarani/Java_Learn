package java8.basics2023.interfaceExamples.basic;

public interface TestInterface2 extends TestInterface{
    static void print(String msg){
        System.out.println("TestInterface2::print()"+msg);
    }

    int cube(int num);

    void nonstaticPrint(String str);

    default void showNum(int num){
        System.out.println("In Test Interface2");
        System.out.println(num);
    }
}
