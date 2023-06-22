package org.controlstatementandloops;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (int a = 0; a < 10; a++) {
            System.out.println("The value of a: " + a);
            sum = sum + a;
        }
        System.out.println("The sum of numbers from 0 to 9: " + sum);
    }
}
