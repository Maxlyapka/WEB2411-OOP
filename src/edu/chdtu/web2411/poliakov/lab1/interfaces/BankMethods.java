package edu.chdtu.web2411.poliakov.lab1.interfaces;

import edu.chdtu.web2411.poliakov.lab1.BankAccount;

public interface BankMethods {

    boolean addAccount(BankAccount account);

    boolean moneyTransfer(String amount, String cardNumber);

    void getAllAccounts();
}
