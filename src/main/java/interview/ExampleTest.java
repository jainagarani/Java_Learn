package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * list of strings
 * ABC, ABCDE, DEFABC, DEABCGHI, AABCEFG, EFGAABBCC
 * one more input STring ABC,
 * output map of key - ("ABC" -> 1
 */
public class ExampleTest {

    public static void main(String[] args){
       List<String> strList = Arrays.asList("ABC","ABCDE","DEFABC",
               "DEABCGHI", "AABCEFG", "EFGAABBCC","ABCEFGABCCDF");
      /*  List<String> strList = Arrays.asList("ABCEFGABCCDF");*/
        String input = "ABC";
        HashMap<String,String> map = new HashMap<>();
        for(String str: strList){
          /* if(str.contains(input)){
                String temp = str;
                int count = 0;
              /*  while(temp.indexOf(input)>= 0){
                    count = count +1;
                    int index = temp.indexOf(input);
                    temp = temp.substring(index+input.length()-1);
                }*/

               // map.put(str,""+new ExampleTest().findOccurance(str,input));
            map.put(str,""+new ExampleTest().findOccuranceBySplit(str,input));
          /*  }else{
                map.put(str,"0");
            }*/
        }
        map.entrySet().forEach(k-> System.out.println(k.getKey() +" : "+k.getValue()) );
       // System.out.println("findOccurance "+new ExampleTest().findOccurance("ABCEFGABCCDF", "ABC"));
    }

    public int findOccurance(String str, String input){
        Pattern pattern = Pattern.compile("ABC");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
      while(matcher.find()){
          count = count+1;
        }
        return count;
    }

    public int findOccuranceBySplit(String str, String input){

        if(str.equals(input)){
            return 1;
        }else
      return str.split("ABC").length-1;
    }
}
