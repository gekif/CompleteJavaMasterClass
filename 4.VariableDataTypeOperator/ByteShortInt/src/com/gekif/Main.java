package com.gekif;

public class Main {

    public static void main(String[] args) {
//        int myValue = 10000;

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);

//        System.out.println("myTotal = " + myTotal);


        // byte has a width of 8
        byte myByteValue = -128;

        // Error found on byte
//        byte myNewBytevalue = (myByteValue / 2);

        // Error Fix
        byte myNewBytevalue = (byte) (myByteValue / 2);

//        System.out.println("myNewByteValue = " + myNewBytevalue);


        // short has a width of 16
        short myShortvalue = 32767;
        short myNewShortValue = (short) (myShortvalue / 2);

//        System.out.println("myNewShortValue = " + myNewShortValue);


        // long has a width of 64
//        long myLongValue = 100L;
        long myLongValue = -9_3_37_036_854_775_808L;


        /*
         * Challenge
         */
        // 1. Create a byte variable and set it to any valid byte number.
        byte myByte = 20;

        // 2. Create a short variable and set it to any valid short number.
        short myShort = 125;

        // 3. Create a int variable and set it to any valid int number.
        int myInt = 50;

        // Create a variable of type long, and make it equal to
        // 50000 + 10 time of sum of the byte, plus the short plus the int
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        short myShortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("myLong = " + myLong);
        System.out.println("myShortTotal = " + myShortTotal);







    }
}
