package com.example.javaexam.ex25;

public class Main {
    public static void main(String[] args) {
        // Создаем вилки и философов
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Philosopher philosopher1 = new Philosopher(1, fork1, fork2);
        Philosopher philosopher2 = new Philosopher(2, fork2, fork3);
        Philosopher philosopher3 = new Philosopher(3, fork3, fork4);
        Philosopher philosopher4 = new Philosopher(4, fork4, fork5);
        Philosopher philosopher5 = new Philosopher(5, fork5, fork1);

        // Запускаем потоки для каждого философа
        new Thread(philosopher1).start();
        new Thread(philosopher2).start();
        new Thread(philosopher3).start();
        new Thread(philosopher4).start();
        new Thread(philosopher5).start();
    }
}
