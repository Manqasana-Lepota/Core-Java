package org.datahandlingtechniques;

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("Capacity of a String Buffer: " + stringBuffer.capacity());

        stringBuffer = new StringBuffer(50);
        System.out.println("Capacity of a String Buffer: " + stringBuffer.capacity());

        stringBuffer = new StringBuffer("My StringBuffer");
        System.out.println("Capacity of a String Buffer: " + stringBuffer.capacity());

        System.out.println("String in String Buffer: " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("My StringBuilder");
        System.out.println("String in String Builder: " + stringBuilder);

        stringBuffer.append(". Append with StringBuffer.");
        stringBuilder.append(". Append with StringBuilder.");
        System.out.println("String in String Buffer: " + stringBuffer);
        System.out.println("String in String Builder: " + stringBuilder);

        stringBuffer = new StringBuffer("AABCBBC");
        stringBuilder = new StringBuilder("abaabcabac");

        stringBuffer.insert(5, "pqrst");
        stringBuilder.insert(3, "XYZ");
        System.out.println("String in String Buffer: " + stringBuffer);
        System.out.println("String in String Builder: " + stringBuilder);

        System.out.println("Reverse String Buffer: " + stringBuffer.reverse());
        System.out.println("Reverse String Builder: " + stringBuilder.reverse());


    }
}
