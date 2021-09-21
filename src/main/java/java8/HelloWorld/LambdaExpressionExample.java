package java8.HelloWorld;

public class LambdaExpressionExample {
    public static void main(String[] args){
       Addable doubleNumber = (int a)->  a*2;
       System.out.println(doubleNumber.multiplyBy2(2));

       Addable addable = new Addable() {
           @Override
           public int multiplyBy2(int a) {
               return a*2;
           }
       };
        System.out.println("Annonymous Inner :"+addable.multiplyBy2(5));

       Dividable safeDivide =(int a, int b) -> {
            if(b == 0) return 0;
            else return a/b;
        };

       StringLengthLambda lengthLambda =  s -> s.length();
       lengthLambda.getLength("Hello Lambda");

        findLength(s -> s.length());


    }

    public static void findLength(StringLengthLambda stringLengthLambda){
        System.out.println(stringLengthLambda.getLength("Hello Lambda"));
    }




}
