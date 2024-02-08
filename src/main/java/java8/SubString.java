package java8;

public class SubString {
    public static void main(String[] args){
        String s ="Hello World";
        String s1 = "HelloT Java World";

       for(int i=0 ; i<s.length();i++){
           for(int j =0;j< s1.length();j++){
               int k =0;
               while((i+k) <s.length() && (j+k) < s1.length() &&
                       (s.charAt(i+k)) == s1.charAt(j+k)){
                   k = k+1;
               }
               System.out.println("i is "+i +" k is "+k );
               if((i+k) > i && i+k != i) {
                   System.out.println(s.substring(i, i+k));
               }
           }

       }

    }
}
