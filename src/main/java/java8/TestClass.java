package java8;

import java.util.Arrays;
import java.util.List;


/**
 * [13:52] Perumal Raj Sivarajan
 *
 * Wrtie a function find largest unique substring(unique substring is a substring that contains same character consecutively) in a string and return its length.
 *
 *
 *
 * Eg1. Input: 'aabbccc'
 *
 * Unqiue substring: 'aa', 'bb', 'ccc'.
 *
 * Return 3
 *
 *
 *
 * Unique substrings: 'a', 'b', 'c'.
 *
 * Eg2: 'abc'
 *
 * Return 1
 */
public class TestClass {

    public static void main(String[] args){
        String input = "aabbccc";
        int maxCount = 0;
        for(int i =0; i<input.length(); i++){
            int startIndex = i;
            if( i < input.length()-1 && input.charAt(i) == input.charAt(i+1) ){
    System.out.println("match");

            }else {
                int endIndex = i + 1;
                String group = input.substring(startIndex, endIndex);
                System.out.println(input.substring(startIndex, endIndex));
                maxCount = maxCount < group.length() ? group.length() : maxCount;
                System.out.println("maxCount"+maxCount);
            }
        }

    }
}
