package com.gekif;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". Hello World");
        }

        System.out.println("***********************************************");


        /**
         * Challenge
         */

        double amount = 10000.0;
        int minRange = 2;
        int maxRange = 20;

        for (int i = minRange; i < maxRange; i++) {
            System.out.println(amount + " at " + i + "% interest = " + calculateIntereset(amount, i));
        }

        System.out.println("***********************************************");

        for (int i = maxRange; i > minRange; i--) {
            System.out.println(amount + " at " + i + "% interest = " + calculateIntereset(amount, i));
        }

        System.out.println("***********************************************");

        /**
         * Prime Number
         */

        // Initiate Count
        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");

                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }





    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // Math.sqrt same as n/2
        for (int i = 2; i <= n /2; i++) {
//        for (int i = 2; i <= (long) Math.sqrt(n); i++) {

            // Debugging
//            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }


        return true;
    }


    private static double calculateIntereset(double amount, double interestRate) {
        return Math.round((amount * (interestRate / 100)));
    }
}
