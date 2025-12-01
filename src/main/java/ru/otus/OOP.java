package ru.otus;
import java.util.*;

public class OOP {
    public static void main(String[] args) {
        // Тестовые примеры
        System.out.println("Тестирование температурного конвертера:");
        System.out.println("======================================");
        Dog dog1 = new Dog();
        dog1.setName("Bobik");
        dog1.setAge(7);
        System.out.println("Собаку звать "+ dog1.getName());
        System.out.println("Ей "+ dog1.getAge() + "лет");

        Dog dog2 = new Dog();
        dog2.setName("Tyshenka");
        dog2.setAge(-3);
        System.out.println("Собаку звать "+ dog2.getName());
        System.out.println("Ей "+ dog2.getAge() + "лет");
    }
}
