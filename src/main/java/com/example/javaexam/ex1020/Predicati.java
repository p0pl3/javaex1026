package com.example.javaexam.ex1020;

import java.util.function.Predicate;

public class Predicati {
    public static void main(String[] args) {
        Predicate notNull = (str) -> str != null;
        String str1 = "Hello";
        String str2 = null;

        System.out.println(notNull.test(str1)); // true
        System.out.println(notNull.test(str2)); // false
    }
}
