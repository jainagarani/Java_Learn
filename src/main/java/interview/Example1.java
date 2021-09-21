package interview;

import java.util.*;
import java.util.stream.Collectors;

/*
e.g. String - AB
     Output - AB, BA

 */
public class Example1 {

    public void findPermutations(String s){
        Set<String> set = new HashSet<>();

       // set.stream().max((e1,e2) -> e1.compareTo(e2) ).get()
       //list.add(s);
        char[] ch =  s.toCharArray();
        StringBuilder reversedStr = new StringBuilder();
        for(int j= s.length()-1; j >=0;j--){
            reversedStr.append(ch[j]);
        }
        System.out.println(reversedStr);
       for(int i=0; i<ch.length; i++){
           findSubString(s,i,set);
           findSubString(reversedStr.toString(),i,set);
       }
        set.forEach(System.out::println);

    }

    public void findPermutationsNew(String s){
        Set<String> set = new HashSet<>();
        //list.add(s);
        char[] ch =  s.toCharArray();
        char[] c = new char[ch.length];
        for(int i=0; i<ch.length; i++){
            String str = s.substring(i);
            //str.split();
            StringBuilder temp = new StringBuilder(str);
            if(i > 0  ){
               str += s.substring(0,i);
                StringBuilder str1 = temp;
               for(int j =i; j>=0;j--){
                   str1.append(ch[j]);
               }
                set.add(str1.toString());
            }
            set.add(str);




        }
        set.forEach(System.out::println);

    }

    public void findSubString(String s, int index,Set<String> list){
        list.add(s.substring(index));

        }



    public static void main(String[] args){
        Example1 example1 = new Example1();
        example1.findPermutationsNew("ABC");

    }

   }



