package interview;

import java.util.HashSet;

public class Country {
    public String name;

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String args[]) {
        Country countryOne = new Country();
        Country countryTwo = new Country();
        countryOne.name = "India";
        countryTwo.name = "Nepal";
        HashSet<Country> countrySet = new HashSet<>();
        countrySet.add(countryOne);
        countrySet.add(countryTwo);
        System.out.println(countrySet.size());
        countrySet.stream().forEach(System.out::println);
    }
}
