package edu.chdtu.web2411.poliakov.lab1.accounts.business;

import edu.chdtu.web2411.poliakov.lab1.BankAccount;
import edu.chdtu.web2411.poliakov.lab1.interfaces.CalculateInterest;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Withdrawal;

public class BusinessAccount extends BankAccount implements Withdrawal, CalculateInterest {
    protected String companyName;
    protected double creditLimit;
    protected double interestRate;

    public BusinessAccount(String owner, String cardNumber, double balance, String companyName, double creditLimit, double interestRate) {
        super(owner, cardNumber, balance);
        this.companyName = companyName;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }


    @Override
    public boolean withdrawal(double amount) {
        double available = this.balance + creditLimit;
        if (amount > 0 && amount <= available) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public double calculateInterestRate(int days) {
        if(balance >= 0 ) return 0;
        double overdraft = -balance;
        return Math.floor((overdraft * this.interestRate * days) / (365 * 100));
    }
}
