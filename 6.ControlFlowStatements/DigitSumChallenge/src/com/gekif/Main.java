package com.gekif;

public class Main {

    public static void main(String[] args) {
        int digit1 = 125;
        int digit2 = -125;
        int digit3 = 4;
        int digit4 = 32123;

        System.out.println("The sum of the " + digit1 + " is " + sumDigits(digit1));
        System.out.println("The sum of the " + digit2+ " is " + sumDigits(digit2));
        System.out.println("The sum of the " + digit3 + " is " + sumDigits(digit3));
        System.out.println("The sum of the " + digit4 + " is " + sumDigits(digit4));

    }


    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // Extract the lest-significant block
            int digit = number % 10;
            sum += digit;

            // Drop the least significant digit
            number /= 10; // same as number = number / 10;
        }

        return sum;
    }
}
