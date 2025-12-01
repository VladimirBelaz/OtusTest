package ru.otus;

public class Puppy extends Animal{

    @Override
    public void speek() {
        System.out.println("Тяв, тяв, под столом всех обговняв!");
    }

    public Puppy(String name, int age) {
        super(name, age);
    }
}
