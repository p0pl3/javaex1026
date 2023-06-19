package com.example.javaexam.ex25;

public class Fork {
    private final int id;

    public Fork(int id) {
        this.id = id;
        this.ready = true;
    }

    public volatile boolean ready;

    @Override
    public String toString() {
        return "Fork #" + id;
    }
}
