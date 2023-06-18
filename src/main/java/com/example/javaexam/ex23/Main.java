package com.example.javaexam.ex23;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumbers());
        Thread t2 = new Thread(new PrintNumbers());
        Thread t3 = new Thread(new PrintNumbers());

        t1.start();
        t2.start();
        t3.start();
    }
}
