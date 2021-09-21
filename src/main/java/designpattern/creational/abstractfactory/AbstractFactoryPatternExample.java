package designpattern.creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the bank you want to take loan from");
        String bankName = bufferedReader.readLine();
        System.out.println("Enter the type of loan");
        String loanName = bufferedReader.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank("SBI");
        System.out.println("enter the interest rate for Bank");
        double rate = Double.parseDouble(bufferedReader.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(bufferedReader.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(bufferedReader.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);

}



}
