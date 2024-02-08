package java8.lambda.basics;

import java.util.concurrent.Callable;

public class TypeInferenceExample {
    public static void main(String[] args){

        printLambda(s-> s.length());



    }

    public static void printLambda(StringLengthInterface stringLengthInterface){
        System.out.println(stringLengthInterface.findLength("hello world"));
    }
}

interface StringLengthInterface{
    int findLength(String s);
}
