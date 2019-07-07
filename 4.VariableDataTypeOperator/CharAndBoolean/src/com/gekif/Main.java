package com.gekif;

public class Main {

    public static void main(String[] args) {
        // Width of 16 (2 bytes)
//        char myChar = 'D';
//        char myChar = 's';
//        char myChar = '2';
//        char myChar = '%';
        char myChar = '\u00A9';

//        System.out.println("Unicode Character = " + myChar);


//        boolean myBoolean = true;
//        boolean myBoolean = false;
        boolean isMale = true;

        /*
         * Challenge
         */

        // 1. Find the code for registered symbol on the same line as the copyright symbol.
        // Done

        // 2. Create a variable of type char and assign it unicode value for that symbol
        char registerdSymbol = '\u00AE';

        // 3. Display in on screen
        System.out.println("Registerd Symbol: " + registerdSymbol);


    }
}
