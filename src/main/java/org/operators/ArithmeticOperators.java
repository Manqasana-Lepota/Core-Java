package org.operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a, b, result;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the value of a and b: ");

        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;
        System.out.println("Result after addition: " + result);

        result = a - b;
        System.out.println("Result after subtraction: " + result);

        result = a * b;
        System.out.println("Result after multiplication: " + result);

        result = a / b;
        System.out.println("Result after division: " + result);

        result = a % b;
        System.out.println("Reminder: " + result);



    }
}
