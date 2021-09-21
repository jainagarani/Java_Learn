package Examples;

import java.util.Objects;

public class Employee {

    private long id;
    private String firstName;

    public Employee(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
