package org.example;

abstract class AnimalApp {
    protected String name;

    public AnimalApp(String name) {
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

class Dog extends AnimalApp {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 25;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println("Жаль, но " + name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println("Увы, " + name + " не может проплыть больше " + MAX_SWIM_DISTANCE + " м.");
        }
    }
}

class Cat extends AnimalApp {
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println("Увы," + name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Все же знают - " + name + " не умеет плавать.");
    }
}