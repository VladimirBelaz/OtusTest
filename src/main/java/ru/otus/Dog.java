package ru.otus;

public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age < 0) {
            System.out.println("Поле возраст должно быть положительным");
            return;
        }
        this.age = age;
    }

    public void bark() {
        System.out.println("Гав, гав, стой, хто идет?");
    }
    public void bark(Integer x) {
        System.out.println("Гав, гав " + x);
    }

}

