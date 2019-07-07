package com.gekif;

public class Main {

    public static void main(String[] args) {
        // Width of int = 32 (4 bytes)
//        int myIntValue = 5;
//        int myIntValue = 5 / 2;
        int myIntValue = 5 / 3;

        // Width of float = 32 (4 bytes)
//        float myFloatValue = (float) 5.4;
//        float myFloatValue = 5.4F;
//        float myFloatValue = 5F;
//        float myFloatValue = 5F / 2F;
        float myFloatValue = 5F / 3F;

        // Width of double = 64 (8 bytes)
//        double myDoubleValue = 5D;
//        double myDoubleValue = 5D / 2D;
        double myDoubleValue = 5D / 3D;
/*
        System.out.println("myValue = " + myIntValue);
        System.out.println("myValue = " + myFloatValue);
        System.out.println("myValue = " + myDoubleValue);*/

        /*
         * Challenge
         * Convert a given number of pounds to kilograms
         */

        // 1. Create a variable to store number of pounds
        double numPounds = 200D;
        double convertedKilograms = numPounds * 0.45359237D;

        System.out.println("Kilograms = " + convertedKilograms);


        // Circle
        double pi = 3_000_000.1415927D;

    }
}
