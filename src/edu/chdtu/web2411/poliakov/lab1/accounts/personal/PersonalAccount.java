package edu.chdtu.web2411.poliakov.lab1.accounts.personal;

import edu.chdtu.web2411.poliakov.lab1.BankAccount;
import edu.chdtu.web2411.poliakov.lab1.interfaces.CalculateInterest;
import edu.chdtu.web2411.poliakov.lab1.interfaces.PersonalAccountMethods;

public class PersonalAccount extends BankAccount implements PersonalAccountMethods, CalculateInterest {
    protected double limitPerDay;
    private double interestRate = 10;

    public PersonalAccount(String owner, String cardNumber, double balance, double limitPerDay) {
        super(owner, cardNumber, balance);
        this.limitPerDay = limitPerDay;
    }

    @Override
    public double setLimitPerDay(double limit) {
        this.limitPerDay = limit;
        return this.limitPerDay;
    }

    @Override
    public boolean withdrawal(double amountPay) {
        if((this.balance - amountPay) <= this.limitPerDay && (this.balance - amountPay > 0)) {
            this.limitPerDay -= amountPay;
            this.balance -= amountPay;
            return true;
        }
        return false;
    }

    @Override
    public double calculateCashback(double amountSpent, double cashbackPercent) {
        if(this.balance < amountSpent) return 0;
        this.balance -= amountSpent;
        double cashback = (amountSpent / 100) * cashbackPercent;
        return this.balance += cashback;
    }

    @Override
    public double calculateInterestRate(int days) {
        if(balance >= 0 ) return 0;
        double overdraft = -balance;
        return Math.floor((overdraft * this.interestRate * days) / (365 * 100));
    }
}
