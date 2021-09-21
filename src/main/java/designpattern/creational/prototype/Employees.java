package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private List<String> empList;

    public Employees(){
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> empList){
        this.empList = empList;
    }

    public void loadData(){
        empList.add("jai");
        empList.add("naga");
    }
    public List<String> getEmpList(){
        return this.empList;
    }

    @Override
    public Object clone(){
        List<String> empCloneList = new ArrayList<>();
        for(String s:getEmpList()){
            empCloneList.add(s);
        }
        return new Employees(empCloneList);
    }
}
