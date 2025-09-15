package edu.chdtu.web2411.poliakov.lab1.accounts.personal.savings;

import edu.chdtu.web2411.poliakov.lab1.accounts.personal.PersonalAccount;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Withdrawal;

public class SavingsAccount extends PersonalAccount implements Withdrawal {
    protected double minimalBalance;
    public SavingsAccount(String owner, String cardNumber, double balance, double limitPerDay, double minimalBalance) {
        super(owner, cardNumber, balance, limitPerDay);
        this.minimalBalance = minimalBalance;
    }

    @Override
    public boolean withdrawal(double amountPay) {
        if((amountPay > 0 && (this.balance - amountPay) >= this.minimalBalance)) {
            this.balance -= amountPay;
            return true;
        }
        return false;
    }
}
