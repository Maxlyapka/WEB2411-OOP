package edu.chdtu.web2411.poliakov.lab1.interfaces;

@FunctionalInterface
public interface Operation<T> {
    boolean execute(T value);
}
