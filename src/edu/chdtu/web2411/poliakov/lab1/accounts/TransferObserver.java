package edu.chdtu.web2411.poliakov.lab1.accounts;

import edu.chdtu.web2411.poliakov.lab1.interfaces.TransferMethods;

import java.util.ArrayList;

public class TransferObserver implements TransferMethods {
    protected ArrayList<Transfer> transfers;

    public TransferObserver() {
        transfers = new ArrayList<>();
    }

    @Override
    public boolean addTransfer(Transfer transfer) {
        transfers.add(transfer);
        return true;
    }
}
