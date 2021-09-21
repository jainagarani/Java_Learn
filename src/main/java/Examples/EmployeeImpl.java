package Examples;

import java.util.HashMap;

public class EmployeeImpl {
    public static void main(String[] args){
        Employee employee = new Employee(1,"jai");
        Employee employee1 = new Employee(2,"naga");
        HashMap<Employee, Integer> map = new HashMap<>();
        map.put(employee,1);
        map.put(employee1,2);
        System.out.println(map.size());
        System.out.println(map.get(employee));
        System.out.println(map.get(employee1));
    }
}
