package basics;

import java.util.HashMap;
import java.util.Map;


public class ImmutableClassExample {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("Jai", "Rani");
        map.put("Prasad", "Tharippala");
        ImmutableClass immutableClass = new ImmutableClass("Jai", map);
        immutableClass.getMap().forEach((k,v)-> System.out.println("key is "+k+" Val is "+v));
        map.put("Jai", "12");
        map.forEach((k,v)-> System.out.println("key is "+k+" Val is "+v));
        immutableClass.getMap().forEach((k,v)-> System.out.println(" after modification key is "+k+" Val is "+v));

    }
}

