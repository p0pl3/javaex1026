package com.example.javaexam.ex1020;


import java.util.function.Predicate;

public class PredicatiStart {
    public static void main(String[] args) {
        Predicate<String> condition = str -> str.startsWith("J") || str.startsWith("N") && str.endsWith("A");
//        condition = condition.and(str -> str.endsWith("A"));

        String str1 = "Java";
        String str2 = "Node.js";
        String str3 = "Python";

        System.out.println(condition.test(str1)); // true
        System.out.println(condition.test(str2)); // false
        System.out.println(condition.test(str3)); // false
    }
}
