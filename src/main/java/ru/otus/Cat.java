package ru.otus;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void speek(){
        System.out.println("Рмявка, рмявка, на ковре козявка!");
    }

}
