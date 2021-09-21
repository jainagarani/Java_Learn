package designpattern.creational.abstractfactory;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        Bank bank = null;
        if(bankName.equals("SBI")){
            bank =  new SBI();
        }
        else if(bankName.equals("HDFC")){
            bank =  new HDFC();
        }
        return bank;
    }

    @Override
    public Loan getLoan(String Loan) {
        return null;
    }
}
