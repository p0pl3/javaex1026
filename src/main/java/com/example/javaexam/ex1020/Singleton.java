package com.example.javaexam.ex1020;//Опишите  класс синглтон с отложенной инициализацией. Используйте synchronized

public class Singleton {

    private static volatile Singleton instance;

    // Закрытый конструктор
    private Singleton() {}

    // Метод для получения единственного экземпляра класса
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance1 == instance2); // true
        System.out.println(instance1 == instance3); // true
        System.out.println(instance2 == instance3); // true

    }

}
