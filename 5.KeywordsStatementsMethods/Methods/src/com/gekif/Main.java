package com.gekif;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        calculateScore(true, 800, 5, 100);
        calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

//        calculateScore(true, 10000, 8, 200);
        calculateScore(gameOver, score, levelCompleted, bonus);


    }



//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);

        // This is for void
//        }

        // This is for int
            return finalScore;
        }
//        else {
//            return -1;
//        }

        // Another state for return
        return -1;
    }
}
