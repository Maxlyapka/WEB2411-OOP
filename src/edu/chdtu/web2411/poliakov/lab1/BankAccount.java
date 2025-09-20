package edu.chdtu.web2411.poliakov.lab1;

import edu.chdtu.web2411.poliakov.lab1.enums.AccountStatus;
import edu.chdtu.web2411.poliakov.lab1.enums.AccountType;
import edu.chdtu.web2411.poliakov.lab1.interfaces.operations.FinancialOperations;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Operation;


public abstract class BankAccount implements FinancialOperations {
    protected String owner;
    protected String cardNumber;
    protected double balance;

    protected AccountStatus status;
    protected AccountType accountType;
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

    public boolean withdraw(double amount) {
        Operation<Double> bankWithdraw = amt -> {
            if(this.balance - amt < 0 && amt < this.balance) {
                this.balance -= amt;
                return true;
            }
            return false;
        };
        return  bankWithdraw.execute(amount);
    }
}
