package com.example.javaexam.ex25v2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }

        Thread[] philosophers = new Thread[NUM_PHILOSOPHERS];
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            final int philosopherNum = i;
            philosophers[i] = new Thread(() -> {
                while (true) {
                    think();
                    takeForks(philosopherNum);
                    eat();
                    putForks(philosopherNum);
                }
            });
            philosophers[i].start();
        }
    }

    private static void think() {
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void eat() {
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void takeForks(int philosopherNum) {
        int leftForkNum = philosopherNum;
        int rightForkNum = (philosopherNum + 1) % NUM_PHILOSOPHERS;
        while (true) {
            if (forks[leftForkNum].tryLock()) {
                if (forks[rightForkNum].tryLock()) {
                    return;
                } else {
                    forks[leftForkNum].unlock();
                }
            }
        }
    }

    private static void putForks(int philosopherNum) {
        int leftForkNum = philosopherNum;
        int rightForkNum = (philosopherNum + 1) % NUM_PHILOSOPHERS;
        forks[leftForkNum].unlock();
        forks[rightForkNum].unlock();
    }
}
