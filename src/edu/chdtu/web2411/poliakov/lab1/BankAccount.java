package edu.chdtu.web2411.poliakov.lab1;

import edu.chdtu.web2411.poliakov.lab1.enums.AccountStatus;
import edu.chdtu.web2411.poliakov.lab1.interfaces.BankAccountMethods;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Withdrawal;


public class BankAccount implements BankAccountMethods, Withdrawal {
    protected String owner;
    protected String cardNumber;
    protected double balance;

    protected AccountStatus status;
    protected BankStorage bankStorage;

    public BankAccount(String owner, String cardNumber, double balance) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardInfo() {
        if(isCardBlocked()) {
            throw new Error("Card is blocked");
        }
        return "Card numbers: " + this.cardNumber + "; Owner: " + this.owner + "; Balance: " + this.balance;
    }

    private boolean isCardBlocked() {
        return this.status == AccountStatus.BLOCKED;
    }


    @Override
    public double getBalance() {
        if(isCardBlocked()) {
            throw new Error("Card is blocked");
        }

        return this.balance;
    }

    @Override
    public double payToCard(double amountPay) {
        return this.balance += amountPay;
    }



    @Override
    public boolean withdrawal(double sumWithdrawal) {
        if(this.balance - sumWithdrawal < 0 && sumWithdrawal < this.balance) {
            this.balance -= sumWithdrawal;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{cardNumber=" + this.cardNumber + ", owner='" + this.owner + "', balance=" + this.balance + "}";
    }

}
