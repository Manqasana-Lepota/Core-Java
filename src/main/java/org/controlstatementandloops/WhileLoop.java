package org.controlstatementandloops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        while(num < 10) {
            System.out.println("The value of num: " + num);
            sum = sum + num;
            num++;
        }
        System.out.println("The sum of numbers from 0 to 9: " + sum);

    }
}
