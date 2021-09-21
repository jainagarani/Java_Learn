package java8.HelloWorld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Jai", "kasirajan", 16),
                new Person("Prasad", "Tharippala", 18),
                new Person("Vishakh", "Tharippala", 10),
                new Person("JayaKrishna", "Tharippala", 6)
        );

        List<Person> sortedLastName = persons.stream().sorted((e1, e2) -> e1.getLastName().compareTo(e2.getLastName())).collect(
                Collectors.toList()
        );
        Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        persons.forEach(person -> System.out.println(person));
        System.out.println(" sorted ");
        // ElementPrintable printable = sortedLastName -> System.out.println(sortedLastName);
        sortedLastName.forEach(person -> System.out.println(person));
        System.out.println(" Filtered ");
        List<Person> filteredLastName = persons.stream().filter(person -> person.getLastName().startsWith("T")).collect(Collectors.toList());
        filteredLastName.forEach(person -> System.out.println(person));
        System.out.println(" condition ");
        performConditionally(persons, person -> person.getLastName().startsWith("T"), person ->System.out.println(person));

        System.out.println(" condition ");
        performConditionally(persons, person -> true, person -> System.out.println(person));



    }

    public static void performConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer){
        personList.forEach(person -> {
            if(predicate.test(person))
                consumer.accept(person);
        });



    }


}
