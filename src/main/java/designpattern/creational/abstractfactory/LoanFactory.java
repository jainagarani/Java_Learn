package designpattern.creational.abstractfactory;

public class LoanFactory extends  AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        Loan loan = null;
        if("HOME".equals(loanName)){
            loan = new HomeLoan();
        }
        else if("Personal".equals(loanName)){

                loan = new PersonalLoan();
            }
        return loan;
    }
}
