package org.controlstatementandloops;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("You have type letter A.");
                break;

            case 'B':
                System.out.println("You have type letter B.");
                break;

            case 'C':
                System.out.println("You have type letter C.");
                break;

            case 'D':
                System.out.println("You have type letter D.");
                break;

            default:
                System.out.println("You have type letter other than (A, B, C, D).");
                break;
        }
        scanner.close();
        System.out.println("End of the program...");
    }
}
