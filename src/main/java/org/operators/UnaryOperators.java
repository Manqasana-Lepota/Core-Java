package org.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int val1, val2;
        val1 = 50;

        val2 = -val1;
        System.out.println("The val1 = " + val1 + ", val2 = " + val2);

        val1 = 50;
        val2 = val1++;
        System.out.println("The val1 = " + val1 + ", val2 = " + val2);

        val1 = 50;
        val2 = ++val1;
        System.out.println("The val1 = " + val1 + ", val2 = " + val2);

        val1 = 50;
        val2 = val1--;
        System.out.println("The val1 = " + val1 + ", val2 = " + val2);

        val1 = 50;
        val2 = --val1;
        System.out.println("The val1 = " + val1 + ", val2 = " + val2);

        boolean bool1, re;
        bool1 = true;

        re = !bool1;
        System.out.println("The bool1 is: " + bool1);
        System.out.println("The result is: " + re);




    }
}
