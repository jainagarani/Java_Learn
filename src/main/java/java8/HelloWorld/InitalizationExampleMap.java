package java8.HelloWorld;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InitalizationExampleMap {


    public static Map<String, String> nameMap;
    public static Map<String, String> nameMap1 = getSingletonMap();
    public static Map<String, String> getSingletonMap(){
        return Collections.singletonMap("Jai","Naga");
    }
    static{
        nameMap = new HashMap<>();
        nameMap.put("Jai","Naga");
        nameMap.put("Prasad","Tharippala");

    }



    public static void main(String[] args){
        nameMap1.forEach((k,v) ->System.out.println("key is"+k +"value is "+v));

        Map<String, Integer> mapStream1 = Stream.of(new Object[][]{
                {"Jai", 1},
                {"Naga", 2}
        }).collect(Collectors.toMap(data -> (String) data[0], data ->(Integer) data[1]));
        mapStream1.put("Rani", 3);

        Map<String, Integer> map1 = Stream.of(
                new AbstractMap.SimpleEntry<>("Prasad", 1),
                new AbstractMap.SimpleEntry<>("Thari", 2)
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)
        );
        map1.put("Vishakh",3);
        map1.forEach((k,v)-> System.out.println(k +" "+v));

        Map<String, Integer> map2 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Vishak", 1),
                new AbstractMap.SimpleImmutableEntry<>("Thari",2)
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        map2.put("Krishna",3);
        map2.forEach((k,v)-> System.out.println(k +" : "+v));



        //mapStream1.entrySet().stream().forEach(e-> System.out.println("key is "+e.getKey()+" Value is "+e.getValue()));


    }
}
