package com.gekif;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);



        /**
         * Create a method called displayHighScorePosition
         * it should a players name as a parameter, and a 2nd parameter as a position in the high score table
         * You should display the players name along with a message like "managed to get into position" and the
         * position they got and a further message " on the high score table".
         * <p>
         * Create a 2nd method called calculateHighScorePosition
         * It should be sent one argument only, the player score
         * it should return int
         * the return data should be
         * 1 if the score is >= 1000
         * 2 if the score is >= 500 and < 1000
         * 3 if the score is >= 100 and < 500
         * 4 in all other cases
         * call both methods and display the result of the following
         * a score of 1500, 900, 400, and 50
         */

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Fikar", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Febrina", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Fina", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Feni", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Fenti", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Idham", highScorePosition);

    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
            + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playScore) {
        if (playScore >= 1000) {
            return 1;
        } else if (playScore >= 500 && playScore < 1000) {
            return 2;
        } else if (playScore >= 100 && playScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}
