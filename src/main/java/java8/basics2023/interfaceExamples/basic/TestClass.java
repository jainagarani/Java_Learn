package java8.basics2023.interfaceExamples.basic;

public class TestClass implements TestInterface2{
   @Override
    public void nonstaticPrint(String str){
       System.out.println(str);
   }

    @Override
    public void showNum(int num) {
        TestInterface2.super.showNum(num);
    }

    @Override
   public int cube(int num){
       return num*num*num;
   }
}
