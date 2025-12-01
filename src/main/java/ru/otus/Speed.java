package ru.otus;

public interface Speed {
    void speak();
    default void speak2() {
        System.out.println("Default method");
    }
}
