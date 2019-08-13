package com.gekif;

public class Main {

    public static void main(String[] args) {
	    /*int count = 1;

        System.out.println("Loop using While");
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }


        System.out.println("*****************************");


        System.out.println("Loop using For");
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }


        System.out.println("*****************************");


        System.out.println("Loop Using While True");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }


        System.out.println("*****************************");


        System.out.println("Loop Using Do While");
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);

        */

        /**
         * Challenge Time 1
         */

    /*    int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("even number " + number);
        }*/


        /**
         * Challenge Time 2
         */

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("even number " + number);

            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }

        }

        System.out.println("Total even numbers found = " + evenNumberFound);


    }

    private static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
