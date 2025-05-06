package java8.basics2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonExample {
    public static void main(String[] args){
        List<Person> personList = Arrays.asList(
              new Person("jai", "Baga", 16) ,
                new Person("prasad","thari", 20),
                new Person("Asha", "AR", 16),
                new Person("Aradhana", "aani", 16)
        );

        personList.stream().forEach(p -> System.out.println(p.toString()));
        System.out.println("In filter ");
       personList.stream().filter(p -> p.getFirstName().startsWith("A")).forEach(p -> System.out.println(p.toString()));

       // printConditionally(personList,(p)-> p.getLastName().startsWith("A"), (person -> System.out.println(person)));
        printConditionally(personList,(p)-> p.getLastName().startsWith("A"), System.out::println);
        /*Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });*/
        System.out.println("After sort ");
        Collections.sort(personList, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
        personList.stream().forEach(p -> System.out.println(p.toString()));
    }

    public static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }


}

interface Condition{
    boolean test(Person person);
}
