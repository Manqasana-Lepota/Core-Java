package org.inputoutput;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("This is an Output line");

        int x = 10;

        System.out.println("Value of x: " + x);

        System.out.print("First String");
        System.out.print("Second String");

        System.out.printf("This is the value of x = %d, PI = %f \n",x,22f/7);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data using keyboard:");
        int data = scanner.nextInt();

        System.out.println("The data, that has been read: " + data);
        scanner.close();
    }
}
