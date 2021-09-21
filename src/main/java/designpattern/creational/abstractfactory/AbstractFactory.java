package designpattern.creational.abstractfactory;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanName);
}
