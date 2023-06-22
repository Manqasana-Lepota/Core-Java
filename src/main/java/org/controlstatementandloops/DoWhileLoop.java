package org.controlstatementandloops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;
        char repeat = 0;
        String input;

        do {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            System.out.println("****************************************************");

            System.out.print("Do you want to calculate the sum again? Yes or No?");
            input = scanner.next();
            repeat = input.charAt(0);

        }while(repeat == 'Y'|| repeat == 'y');
    }
}
