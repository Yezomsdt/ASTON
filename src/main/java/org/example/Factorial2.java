package org.example;

import java.util.Scanner;

public class Factorial2 {
    public static long factorial2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Только для положительных чисел.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial2 factorialCalculator = new Factorial2();

        System.out.print("Введи число для вычисления факториала: ");
        int number = scanner.nextInt();

        try {
            long result = factorialCalculator.factorial2(number);
            System.out.println("Факториал " + number + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}