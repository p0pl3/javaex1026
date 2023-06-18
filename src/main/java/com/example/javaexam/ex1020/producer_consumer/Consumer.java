package com.example.javaexam.ex1020.producer_consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer num = queue.take();
                System.out.println("Consumed: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}