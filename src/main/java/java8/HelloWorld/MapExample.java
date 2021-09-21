package java8.HelloWorld;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args){

        Map<String, Employee> empMap = Stream.of(
new AbstractMap.SimpleEntry<>("1",new Employee("1","Jai","Development",100)),
        new AbstractMap.SimpleEntry<>("2",new Employee("2","Prasad","Account",10000)),
                new AbstractMap.SimpleEntry<>("3",new Employee("3","Vishakh","Trainee",10000000)),
                new AbstractMap.SimpleEntry<>("4", new Employee("4", "Krishna", "Trainee", 34 ))
        ).collect(Collectors.toMap( Map.Entry::getKey,  Map.Entry::getValue));
        Map<String, Employee> empMap5 = empMap.entrySet().stream().sorted((e1,e2) -> e1.getValue().getSalary()-e2.getValue().getSalary()).collect(
                Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));




        empMap.forEach((k,v)-> System.out.println(k +" : "+v));
        List employees = Stream.of( new Employee("1","Jai","Development",100),
                new Employee("2","Prasad","Development",10000),
                new Employee("3","Vishakh","Trainee",10000000)).collect(Collectors.toList());

        Map<String, List<Employee>> empGrpByDepa = (Map<String, List<Employee>>) employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        empGrpByDepa.forEach((k,v)-> System.out.println(k+ " depart map"+v));
       // Map<String, List<Employee>> empGrpByDepa  = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));


        Map<String, Integer> empMap1 = Stream.of(
                new AbstractMap.SimpleEntry<>("1",10 ),
                new AbstractMap.SimpleEntry<>("2",2)

        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, Integer> empMapSorted = empMap1.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        empMapSorted.forEach((k, v)-> System.out.println(k +" : "+v));
    }

}
