package designpattern.creational.factory;

public class PlanFactory{
    public Plan getPlan(String planTYpe){
        Plan plan = null;
        if(planTYpe.equals("Commercial")){
            plan = new Commercial();
        }
        else  if(planTYpe.equals("Domestic")){
            plan = new Domestic();
        }
        else  if(planTYpe.equals("International")){
            plan =  new International();
        }
        return plan;

    }
}
