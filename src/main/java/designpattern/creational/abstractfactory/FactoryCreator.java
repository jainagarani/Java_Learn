package designpattern.creational.abstractfactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equals("Bank")){
            return new BankFactory();
        }else if (choice.equals("Loan")){
            return new LoanFactory();
        }
        return null;    }
}
