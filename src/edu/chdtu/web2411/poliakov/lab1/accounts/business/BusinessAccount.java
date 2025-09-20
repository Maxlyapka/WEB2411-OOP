package edu.chdtu.web2411.poliakov.lab1.accounts.business;

import edu.chdtu.web2411.poliakov.lab1.BankAccount;
import edu.chdtu.web2411.poliakov.lab1.enums.AccountType;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Calculator;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Operation;


public class BusinessAccount extends BankAccount implements Calculator<Integer, Double> {
    protected String companyName;
    protected double creditLimit;
    protected double interestRate;

    public BusinessAccount(String owner, String cardNumber, double balance, String companyName, double creditLimit, double interestRate) {
        super(owner, cardNumber, balance);
        this.companyName = companyName;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.accountType = AccountType.BUSINESS;
    }

    @Override
    public boolean withdraw(double amount) {
        Operation<Double> businessWithdraw = amt -> {
            double available = this.balance + this.creditLimit;
            if(amt > 0 && amt <= available) {
                this.balance -= amt;
                return true;
            }
            return false;
        };
        return businessWithdraw.execute(amount);
    }

    @Override
    public Double calculateInterest(Integer days) {
        if(this.balance >= 0) return 0.0;
        double overdraft = -balance;
        return  Math.floor((overdraft * this.interestRate * days) / (365 * 100));
    }
}
