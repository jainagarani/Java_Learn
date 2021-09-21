package Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapEqualsHashCodesExample {

    public static void main(String[] args){
        System.out.println("hello");
        Map<Person, String> map= new HashMap<>();
        Person p = new Person("Jai");
        map.put(new Person("Jai"),"7");
        map.put(new Person("Jai"),"1");

       System.out.println(" map get"+ map.get(p));

        Map<String, String> strMap = new HashMap<>();
        strMap.put("Jai","5");
        strMap.put("Jai","2");
        System.out.println(map.size());
        System.out.println(strMap.size());


    }
}
