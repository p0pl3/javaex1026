package com.example.javaexam.ex1020;

public class Print {
    public static void main(String[] args) {
        Printable printable = () -> {
            System.out.println("Printing...");
        };
        printable.print();
    }
}
