package com.example.demo;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        if (operation == '+') {
            result = add(num1, num2);
        } else if (operation == '-') {
            result = subtract(num1, num2);
        } else if (operation == '*') {
            result = multiply(num1, num2);
        } else if (operation == '/') {
            result = divide(num1, num2);
        } else {
            System.out.println("Invalid operation!");
        }

        System.out.println("Result: " + result);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0; // Problème potentiel
        }
        return a / b;
    }
}
