package com.example.javaexam.ex25;

public class Fork {
    private final int id;

    public Fork(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fork #" + id;
    }
}
