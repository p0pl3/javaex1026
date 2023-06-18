package com.example.javaexam.ex24;

public class PrintCharThread extends Thread {
    private StringBuilder stringBuilder;

    public PrintCharThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder.charAt(0));
            }
            char ch = stringBuilder.charAt(0);
            ch++;
            stringBuilder.setCharAt(0, ch);
        }
    }
}
