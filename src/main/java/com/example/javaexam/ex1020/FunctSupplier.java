package com.example.javaexam.ex1020;

import java.util.Random;
import java.util.function.Supplier;

public class FunctSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomInt = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };

        System.out.println(randomInt.get()); // напечатает случайное число от 0 до 10
    }
}
