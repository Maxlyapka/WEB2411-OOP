package edu.chdtu.web2411.poliakov.lab2.interfaces.operations;

public interface User {
    double setLimitPerDay(double limit);
    double calculateCashback(double amountSpent, double cashbackPercent);
}
