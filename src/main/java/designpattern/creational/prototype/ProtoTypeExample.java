package designpattern.creational.prototype;

public class ProtoTypeExample {
    public static void main(String[] args){
        Employees employees = new Employees();
        employees.loadData();
        Employees emp1 = (Employees)employees.clone();
        System.out.println(employees.getEmpList());
        System.out.println(emp1.getEmpList());


    }
}
