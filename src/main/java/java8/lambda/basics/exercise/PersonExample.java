package java8.lambda.basics.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonExample {

    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("michel","Peter",23),
                new Person("jai", "naga", 53),
                new Person("Prasad", "Tharippa", 40)
                );
        Map<Integer, List<Person>> personMap = persons.stream().collect(Collectors.groupingBy( Person::getAge));
        personMap.forEach((k,v) -> System.out.println("key is"+k +"value is "+v));
       persons.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
       /* persons.stream().forEach(e-> System.out.println(e));
        System.out.println("after sorting");
        persons.sort((p1,p2) ->p1.getLastName().compareTo(p2.getLastName()));
        persons.stream().forEach(e-> System.out.println(e));
        List<Person> filteredPerson = persons.stream().filter(e -> e.getFirstName().startsWith("R")).collect(Collectors.toList());
        filteredPerson.stream().forEach(e-> System.out.println(e));*/
    }
}
