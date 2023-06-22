package org.controlstatementandloops;

public class ForEachLoop {
    public static void main(String[] args) {
       int[] array = {55, 74, 14, 51, 69, 42, 32, 74};

       for (int value: array) {
           System.out.println("The element: " + value);
       }
    }
}
