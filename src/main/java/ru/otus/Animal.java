package ru.otus;

 abstract class Animal {
    public String name;
    public int age;

    public abstract void speek();


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
