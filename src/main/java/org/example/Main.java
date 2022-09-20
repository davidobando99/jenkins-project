package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        BigInteger number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextBigInteger();

        System.out.println("Enter second number");
        number2 = input.nextBigInteger();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1.add(number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1.subtract(number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1.multiply(number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1.divide(number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();

    }
}
