package com.gekif;

public class Main {

    public static void main(String[] args) {
        /*int value = 1;

        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/


/*        int switchvalue = 10;


        switch (switchvalue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchvalue);
                break;

            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                System.out.println("Actually it was a " + switchvalue);
                break;*/
//        }

        /**
         * Challenge
         */

        /*char charValue = 'F';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could'nt find A, B, C, D, E");
                break;
        }*/


        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}
