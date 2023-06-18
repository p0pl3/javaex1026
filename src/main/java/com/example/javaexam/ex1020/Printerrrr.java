package com.example.javaexam.ex1020;

public class Printerrrr {
    interface Printable {
        void print();
    }

    class Printer {
        public static void printHello() {
            System.out.println("Hello, world!");
        }
    }

        public static void main(String[] args) {
            Printable printable = Printer::printHello;
            printable.print(); // вызов метода printHello() через интерфейс Printable
        }
}
