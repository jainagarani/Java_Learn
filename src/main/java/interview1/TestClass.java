package interview1;

import java.util.Arrays;
import java.util.List;

public class TestClass {

    public static void main(String[] args){



String input = "aabbtaaxx";

                String str = "";

                for (int i = 0; i < input.length(); i++) {
                    int k =1;
                    int counter = 1;
                    System.out.println(input.charAt(i) == input.charAt(i+k));
                    while(i < input.length() && i+k < input.length() && input.charAt(i) == input.charAt(i+k)  ){
                        i = i+k;
                        k++;
                        counter = counter +1;
                        System.out.println("count inside "+counter);
                    }

                    System.out.println("count "+counter);
                    if(counter > 1){
                        str = str + input.charAt(i) + counter;
                    }else{
                        str = str + input.charAt(i);
                    }
                }

                System.out.println(str);

   /* Map<Character, Integer> map = new HashMap<>();


    for (int i = 0; i < input.length(); i++) {
      Character c = input.charAt(i);
      if (map.containsKey(c)) {
        int value = map.get(c);
        map.put(c, value + 1);
      } else {
        map.put(c, 1);
      }

    }


    String str="";
    for (Map.Entry<Character, Integer> entry : map.entrySet()){
      if (entry.getValue() > 1) {
        str = str + entry.getKey() +entry.getValue();
      } else {
        str = str + entry.getKey();
    }
    } */








        }
}
