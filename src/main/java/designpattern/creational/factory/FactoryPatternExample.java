package designpattern.creational.factory;

public class FactoryPatternExample {
    public static void main(String[] args){
        PlanFactory planFactory = new PlanFactory();
        Plan international = planFactory.getPlan("International");
        System.out.println(international.getBill(3));
        Plan domestic = planFactory.getPlan("Domestic");
        System.out.println(domestic.getBill(3));
    }
}
