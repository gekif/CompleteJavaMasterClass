package com.gekif;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result now is " + result);

        result++;
        System.out.println("Result now is " + result);

        result--;
        System.out.println("Result now is " + result);

        result += 2;
        System.out.println("Result now is " + result);

        result *= 10;
        System.out.println("Result now is " + result);

        result -= 10;
        System.out.println("Result now is " + result);

        result /= 10;
        System.out.println("Result now is " + result);


        boolean isAlien = false;

//        if (isAlien == false)
//        if (!isAlien)
        if (isAlien == true)
//        if (isAlien)
            System.out.println("It is not an alien");
//            System.out.println("It is an alien");


//        int topScore = 100;
        int topScore = 80;

//        if (topScore == 100) {
//        if (topScore != 100) {
//        if (topScore > 100) {
//        if (topScore >= 100) {
//        if (topScore < 100) {
        if (topScore <= 100)
            System.out.println("You got high score");


        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");


    }
}
