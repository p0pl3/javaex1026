package com.example.javaexam.ex25;

public class Main {
    public static void main(String[] args) {
        // Создаем вилки и философов
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);

        Philosopher philosopher1 = new Philosopher(1, fork1, fork2);
        Philosopher philosopher2 = new Philosopher(2, fork2, fork1);

        // Запускаем потоки для каждого философа
        new Thread(philosopher1).start();
        new Thread(philosopher2).start();
    }
}
