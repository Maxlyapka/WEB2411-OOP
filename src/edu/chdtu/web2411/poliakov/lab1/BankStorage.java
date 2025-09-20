package edu.chdtu.web2411.poliakov.lab1;

import edu.chdtu.web2411.poliakov.lab1.interfaces.operations.BankOperations;
import edu.chdtu.web2411.poliakov.lab1.interfaces.Operation;

import java.util.ArrayList;

public class BankStorage implements BankOperations {
    protected ArrayList<BankAccount> bankAccounts;

    public BankStorage() {
        bankAccounts = new ArrayList<>();
    }

    @Override
    public boolean addAccount(BankAccount account) {
        Operation<BankAccount> accountOperation = acc -> {
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
