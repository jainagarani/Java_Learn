package designpattern.creational.abstractfactory;

public class HDFC implements Bank{
    String bankName;
    public HDFC(){
        this.bankName = "HDFC";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
