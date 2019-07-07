package com.gekif;

public class Main {

    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is not an error");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

//        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        /*
         *Challenge
         */

        // 1. Create a double variable with the value 20
        double myDouble1 = 20D;

        // 2. Create a second variable of type double with the value 80
        double myDouble2 = 80D;

        // 3. Add both numbers up and multiply by 25
        double total = (myDouble1 + myDouble2) * 25;

        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double remainder = total % 40;
        System.out.println("Remainder is " + remainder);

        // 5. Write an "if" statement that displays a message "Total was over limit"
        //    if the remaining total (#4) is equal to 20 or less
        if (remainder <= 20)
            System.out.println("Total was over the limit");






    }
}
