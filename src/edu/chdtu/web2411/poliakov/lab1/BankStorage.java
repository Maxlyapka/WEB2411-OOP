package edu.chdtu.web2411.poliakov.lab1;

import edu.chdtu.web2411.poliakov.lab1.interfaces.BankMethods;

import java.util.ArrayList;

public class BankStorage implements BankMethods {
    protected ArrayList<BankAccount> bankAccounts;

    public BankStorage() {
        bankAccounts = new ArrayList<>();
    }

    @Override
    public boolean addAccount(BankAccount account) {
        this.bankAccounts.add(account);
        return true;
    }

    @Override
    public boolean moneyTransfer(String amount, String cardNumber) {
        return false;
    }

    @Override
    public void getAllAccounts() {
        for (int i = 0; i < this.bankAccounts.size(); i++) {
            System.out.println(bankAccounts.get(i));
        }
    }
}
