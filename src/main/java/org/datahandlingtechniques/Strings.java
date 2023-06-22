package org.datahandlingtechniques;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charString = {'S', 't', 'r', 'i', 'n', 'g'};

        String str = new String(charString);

        System.out.println("The value of str is: " + str);

        System.out.print("Enter string:");
        str = scanner.next();
        System.out.println("The value of str is: " + str);

        str = "JAVA Strings";
        System.out.println("The value of str is: " + str);

        str = "String" + " " + "Concatenate";
        System.out.println("The value of str is: " + str);

        scanner.close();
    }
}
