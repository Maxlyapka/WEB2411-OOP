package edu.chdtu.web2411.poliakov.lab1.accounts.personal.savings;

import edu.chdtu.web2411.poliakov.lab1.accounts.personal.PersonalAccount;
import edu.chdtu.web2411.poliakov.lab1.enums.AccountType;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Operation;

public class SavingsAccount extends PersonalAccount {
    protected double minimalBalance;
    public SavingsAccount(String owner, String cardNumber, double balance, double limitPerDay, double minimalBalance) {
        super(owner, cardNumber, balance, limitPerDay);
        this.minimalBalance = minimalBalance;
        this.accountType = AccountType.SAVINGS;
    }

    @Override
    public boolean withdraw(double amount) {
        Operation<Double> savingsWithdraw = amt -> {
            if((amount > 0 && (this.balance - amount) >= this.minimalBalance)) {
                this.balance -= amount;
                return true;
            }
            return false;
        };
        return savingsWithdraw.execute(amount);
    }
}
