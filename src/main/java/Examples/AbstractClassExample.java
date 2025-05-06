package Examples;

public class AbstractClassExample {
    public static void main(String[] args){
        System.out.println("Hello World");
        Addition addition = new Addition();
        int sum = addition.getSum(5,3);
        System.out.println("Sum is "+sum);

    }
}
