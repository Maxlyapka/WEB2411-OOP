package edu.chdtu.web2411.poliakov.lab1.accounts;

import edu.chdtu.web2411.poliakov.lab1.interfaces.TransferMethods;

public class Transfer implements TransferMethods {
    protected String cardNumber;
    protected int amount;
    protected String message;

    protected TransferObserver transferObserver;

    public Transfer(int amount, String cardNumber, String message) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.message = message;
    }

    @Override
    public boolean addTransfer(Transfer transfer) {
        transferObserver.addTransfer(transfer);
        return true;
    }
}
