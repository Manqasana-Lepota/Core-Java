package org.controlstatementandloops;

public class BreakStatement {
    public static void main(String[] args) {
        int a = 0;
        while(true) {
            System.out.println("The value of a: " + a);

            if (a == 10){
                break;
                //a++;

            }
            System.out.println("End of the program...");
        }
    }
}
