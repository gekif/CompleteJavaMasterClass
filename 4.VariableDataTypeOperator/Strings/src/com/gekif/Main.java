package com.gekif;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);


        String numberString = "250.55";
        numberString = numberString + "49.95";

        // Result is concatenation
        System.out.println("The result is " + numberString);


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        // The int is automatically converted to String
        System.out.println("LastString is equal to " + lastString);


        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}
