package com.example.javaexam.ex1020;

import java.util.function.Consumer;

public class ConsumerBox {
    static class HeavyBox {
        int weight;

        HeavyBox(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    public static void main(String[] args) {
        HeavyBox box = new HeavyBox(100);

        Consumer<HeavyBox> shipment = b -> {
            System.out.println("Отгрузили ящик с весом " + b.getWeight());
        };
        shipment = shipment.andThen(b -> {
            System.out.println("Отправляем ящик с весом " + b.getWeight());
        });

        shipment.accept(box);
    }
}
