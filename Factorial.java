package org.example;
import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число для вычисления факториала: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Только для положительных чисел.");
        } else {
            long result = factorial(number);
            System.out.println("Факториал " + number + " = " + result);
        }

        scanner.close();
    }
}