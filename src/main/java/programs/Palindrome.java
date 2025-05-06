package programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s =scanner.nextLine();
        System.out.println(new Palindrome().isPalindrome(s));
        System.out.println(new Palindrome().isSubsequencePalindrome(s));
    }

    public boolean isPalindrome(String str){
        char[] charArr =str.toCharArray();
        for(int i = 0, j=str.length()-1; i<j; i++, j--){
           if(charArr[i] != charArr[j]){
               return false;
           }
        }
        return true;
    }

    public boolean isSubsequencePalindrome(String str){
        char[] charArr =str.toCharArray();
        String subSequence="";
        boolean isSbSequence = false;
        for(int i = 0, j=str.length()-1; i<j;  j--){
            if(charArr[i] == charArr[j]){

               subSequence +=charArr[i];
                isSbSequence = true;
            }else{
                isSbSequence = false;
            }
            i++;
        }
        System.out.println("subse "+subSequence);
        return isSbSequence;
    }
}
