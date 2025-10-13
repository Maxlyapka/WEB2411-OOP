package edu.chdtu.web2411.poliakov.lab1.accounts;

import edu.chdtu.web2411.poliakov.lab1.enums.AccountStatus;
import edu.chdtu.web2411.poliakov.lab1.enums.AccountType;
import edu.chdtu.web2411.poliakov.lab1.interfaces.BankAccount;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Predicate;


public abstract class Account implements BankAccount {
    protected String owner;
    protected String cardNumber;
    protected double balance;

    protected AccountStatus status;
    protected AccountType accountType;

    public Account(String owner, String cardNumber, double balance) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public double payToCard(double amountPay) {
        return this.balance += amountPay;
    }

    public boolean withdraw(double amount) {
        Predicate<Double> bankWithdraw = amt -> {
            if(this.balance - amt < 0 && amt < this.balance) {
                this.balance -= amt;
                return true;
            }
            return false;
        };
        return  bankWithdraw.execute(amount);
    }
}
