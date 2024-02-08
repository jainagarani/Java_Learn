package java8.basics2023.interfaceExamples.basic;

public interface TestInterface {
     static void print(){
         System.out.println("TestInterface::print()");
     }

     int cube(int num);

     void nonstaticPrint(String str);

     default void showNum(int num){
         System.out.println("In Test Interface");
         System.out.println(num);
     }
}
