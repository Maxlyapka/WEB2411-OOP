package edu.chdtu.web2411.poliakov.lab2;

import edu.chdtu.web2411.poliakov.lab2.accounts.Account;
import edu.chdtu.web2411.poliakov.lab2.interfaces.Predicate;
import edu.chdtu.web2411.poliakov.lab2.interfaces.operations.Bank;

import java.util.ArrayList;

public class BankStorage implements Bank {
    protected ArrayList<Account> bankAccounts;

    public BankStorage() {
        bankAccounts = new ArrayList<>();
    }

    @Override
    public boolean addAccount(Account account) {
        Predicate<Account> accountOperation = acc -> {
            this.bankAccounts.add(acc);
            return true;
        };
        return accountOperation.execute(account);
    }

    public void getAllAccounts() {
        for (int i = 0; i < this.bankAccounts.size(); i++) {
            System.out.println(bankAccounts.get(i));
        }
    }
}
