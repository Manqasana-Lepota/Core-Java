package org.datahandlingtechniques;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50};

        float[] floatArr = new float[5];

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 2.5F;
        floatArr[1] = 7.23F;
        floatArr[2] = 5.6F;
        floatArr[3] = 8F;
        floatArr[4] = 7.125F;

        char[] charArr = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter character for index (" + i + "): ");
            charArr[i] = sc.next().charAt(0);
        }
        System.out.print("Items of Integer array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();

        System.out.print("Items of Float array: ");
        for (float item: floatArr) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Items of Character array: ");
        for (char item: charArr) {
            System.out.print(item + " ");
        }
    }

}
