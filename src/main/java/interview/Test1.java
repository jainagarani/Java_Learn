package interview;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args){
        Map<String, Employee> empMap = Stream.of(
                new AbstractMap.SimpleEntry<>("1", new Employee(100,"Jai")),
                new AbstractMap.SimpleEntry<>("2",new Employee(1, "apple"))
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       Map<String,Employee> sortedMap = empMap.entrySet().stream().sorted((e1,e2)->e1.getValue().getEmpId() -e2.getValue().getEmpId())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
       sortedMap.forEach((k,v)-> System.out.println(k +" "+v));
    }
}
