package java8.inter;

public interface interface1 {
    void method2();

    default void log(String str){
        System.out.println(" in log method of Interface 1"+str);
    }
    static void print(String str){
        System.out.println(" in print method of Interface 1"+str);
    }

}
