package org.variables;

public class Variables {
    public static void main(String[] args) {
        //declaring variables
        int num1 = 20;
        int num2 = 10;

        //printing numbers before swapping
        System.out.println("Num 1 is " + num1);
        System.out.println("Num 2 is " + num2);

        //new line
        System.out.println("****************************************");

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        //printing numbers after swapping
        System.out.println("Num 1 is " + num1);
        System.out.println("Num 2 is " + num2);




    }
}
