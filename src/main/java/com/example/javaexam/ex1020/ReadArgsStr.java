package com.example.javaexam.ex1020;

public class ReadArgsStr {
        public static void main(String[] args) {
            int count = 0;
            for (String str : args) {
                count += str.length();
            }
            System.out.println("Total number of characters: " + count);
        }
    }
