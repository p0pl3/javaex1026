package com.example.javaexam.ex26;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static List<String> deleteEveryFifthElement(List<String> list) {
        AtomicInteger count = new AtomicInteger();
        return list.stream().filter(str -> count.incrementAndGet() % 5 != 0).collect(Collectors.toList());
    }

    public static List<String> deleteEveryFifthElement2(List<String> list) {
        return list.stream().filter(new Predicate<String>() {
            int counter = 1;
            @Override
            public boolean test(String s) {
                return counter++ % 5 != 0;
            }
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("grape");
        list.add("honeydew");
        list.add("kiwi");
        list.add("lemon");
        System.out.println(deleteEveryFifthElement(list));
        System.out.println(deleteEveryFifthElement2(list));
    }
}
