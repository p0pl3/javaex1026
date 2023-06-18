package com.example.javaexam.ex1020.producer_consumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int num;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
        this.num = 0;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                queue.put(num++);
                System.out.println("Produced: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}