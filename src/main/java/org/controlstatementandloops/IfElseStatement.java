package org.controlstatementandloops;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number");
        number = scanner.nextInt();

        if(number < 0) {
            System.out.println("The number " + number + " is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number " + number + " is positive");

        }
        scanner.close();
    }

}
