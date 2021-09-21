package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){
        System.out.println("Hello world");
        String s ="jai Nagarani";
        System.out.println(s.substring(5));
       Map<String, Employee> empMap = Stream.of(
                new AbstractMap.SimpleEntry<>("1", new Employee(10,"Jai")),
        new AbstractMap.SimpleEntry<>("2", new Employee(2, "Naga"))

        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, Employee> sortedMap = empMap.entrySet().stream().sorted((e1,e2)-> {
           return e1.getValue().getEmpId() - e2.getValue().getEmpId();
        }
        ).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        empMap.forEach((k,v)-> System.out.println(k +" :"+v));

        System.out.println("sortedMap");
        sortedMap.forEach((k,v)-> System.out.println(k + "is "+v));





    }
}
