package edu.chdtu.web2411.poliakov.lab1.accounts.personal.credit;

import edu.chdtu.web2411.poliakov.lab1.accounts.personal.PersonalAccount;
import edu.chdtu.web2411.poliakov.lab1.interfaces.CalculateInterest;

public class CreditAccount extends PersonalAccount implements CalculateInterest {
    protected double creditLimit;
    protected double minimalPayment;
    protected double totalCredit;

    public CreditAccount(String owner, String cardNumber, double balance, double limitPerDay, double totalCredit) {
        super(owner, cardNumber, balance, limitPerDay);
        this.totalCredit = totalCredit;
    }

    public void setCreditLimit(double newLimit) {
        this.creditLimit = newLimit;
    }

    public double calculateInterestRate(int days, double interest) {
        if(this.balance >= 0) return 0;

        double amountCredit = -this.balance;
        return  (amountCredit * interest * days) / (365 * 100);
    }
}
