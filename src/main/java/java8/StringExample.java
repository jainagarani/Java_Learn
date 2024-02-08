package java8;

import java.io.Serializable;

public class StringExample  implements Cloneable {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello").intern();
        String s4 = new String("Hello");
        s4 = s4.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}
