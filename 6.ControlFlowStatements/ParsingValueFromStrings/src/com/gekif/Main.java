package com.gekif;

public class Main {

    public static void main(String[] args) {

        // Cannot add character on numeric
        String numberAsString = "2019.12";

        System.out.println("numberAsString = " + numberAsString);

        // Convert String to Integer
//        int number = Integer.parseInt(numberAsString);

        // Change type to double
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);


        numberAsString += 1;
        number += 1;

        // Concatenate
        System.out.println("numberAsString = " + numberAsString);

        // Add number to it
        System.out.println("number = " + number);
    }
}
