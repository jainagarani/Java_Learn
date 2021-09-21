package designpattern.creational.abstractfactory;

public class SBI implements Bank{

    String bankName;
    public SBI(){
        this.bankName = "SBI";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
