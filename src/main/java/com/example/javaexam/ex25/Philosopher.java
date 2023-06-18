package com.example.javaexam.ex25;

import java.util.Random;

public class Philosopher implements Runnable {
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Философ думает
                System.out.println("Philosopher " + id + " is thinking");
                Thread.sleep(new Random().nextInt(1000));

                // Философ голоден и пытается взять левую вилку
                synchronized (leftFork) {
                    System.out.println("Philosopher " + id + " took left fork");

                    // Философ пытается взять правую вилку
                    synchronized (rightFork) {
                        // Философ ест
                        System.out.println("Philosopher " + id + " took right fork and is eating");
                        Thread.sleep(new Random().nextInt(1000));
                        System.out.println("Philosopher " + id + " put down right fork");
                    }

                    // Философ кладет левую вилку на стол
                    System.out.println("Philosopher " + id + " put down left fork");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
