package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Пёсель");
        dog.run(499);
        dog.swim(26);

        Cat cat = new Cat("Кытстер");
        cat.run(15);
        cat.swim(10);
    }
}
