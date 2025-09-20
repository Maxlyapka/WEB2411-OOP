package edu.chdtu.web2411.poliakov.lab1.interfaces;

@FunctionalInterface
public interface Calculator<T, R> {
    R calculateInterest(T days);
}
