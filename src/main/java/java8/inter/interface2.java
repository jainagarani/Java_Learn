package java8.inter;

public interface interface2 {
    void method2();

    default void log(String str){
        System.out.println(" in log method of Interface 2 "+str);
    }

    static void print(String str){
        System.out.println(" in print method of Interface 2 "+str);
    }
}
