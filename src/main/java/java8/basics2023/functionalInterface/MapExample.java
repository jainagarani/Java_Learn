package java8.basics2023.functionalInterface;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args){
        Map<Integer, Employee> employeeMap = Stream.of(
                new AbstractMap.SimpleEntry<>(1,new Employee(1,"jai","rani",1000)),
                new AbstractMap.SimpleEntry<>(2, new Employee(2,"jaya", "krishna",2000))).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
       /* employeeMap.replaceAll((k,v)->

                {
                    v.setSalary(v.getSalary() + 1000.00);
                    return v;

                }
        );*/
        double salary = employeeMap.values().stream().mapToDouble(e -> e.getSalary()).sum();



        System.out.println("salary is "+salary);
        employeeMap.forEach((k, v)-> System.out.println("key is "+ k +" value is "+v.getSalary()));


    }
}
