package com.example.javaexam.ex1020;

import java.util.function.Function;

public class FuncFucntion {
    public static void main(String[] args) {
        Function<Integer, String> checkNumber = n -> {
            if (n > 0) {
                return "Положительное число";
            } else if (n < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };

        System.out.println(checkNumber.apply(42)); // Положительное число
        System.out.println(checkNumber.apply(-42)); // Отрицательное число
        System.out.println(checkNumber.apply(0)); // Ноль
    }
}
