package org.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean result;
        int num1 = 10;
        int num2 = 5;
        int num3 = 2;

        result = (num1 == num1);
        System.out.println("The result is: " + result);

        result = (num2 < num2);
        System.out.println("The result is: " + result);

        result = (num1 > num2);
        System.out.println("The result is: " + result);

        result = (num1 >= num2);
        System.out.println("The result is: " + result);

        result = ( num3 != num3);
        System.out.println("The result is: " + result);
    }
}
