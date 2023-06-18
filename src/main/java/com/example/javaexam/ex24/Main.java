package com.example.javaexam.ex24;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        PrintCharThread t1 = new PrintCharThread(stringBuilder);
        PrintCharThread t2 = new PrintCharThread(stringBuilder);
        PrintCharThread t3 = new PrintCharThread(stringBuilder);

        t1.start();
        t2.start();
        t3.start();
    }
}
