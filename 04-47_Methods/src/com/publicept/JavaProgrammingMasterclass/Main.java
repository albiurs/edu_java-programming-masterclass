package com.publicept.JavaProgrammingMasterclass;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
                // the method's return value is saved to variable highScore
        System.out.println("Final score: " + highScore);



        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score: " + highScore);


        /**
         * Method Challenge
         */
        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        // initialize the variable and assign first value
        // call method to display
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        // call methods another time with new value
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jack", highScorePosition);

        // call methods another time with new value
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        // call methods another time with new value
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    /**
     * Calculate Score
     * @param gameOver
     * @param score
     * @param levelCompleted
     * @param bonus
     * @return
     */
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finaleScore = score + (levelCompleted * bonus);
            finaleScore += 2000;
            return finaleScore;
        }

        return -1;  // -1 is conventionally used to return an error in programming terms.
                    // in searching algorithms, -1 indicates an invalid value or "not found".

    }


    /**
     * Display the player's name and the high score position
     * @param playerName
     * @param highScorePosition
     */
    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println("Player's name: " + playerName +
                " reached the Position: " + highScorePosition);

    }


    /**
     * Calculate the high score position
     * @param playerScore
     * @return
     */
    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
//            return 1;
//        }else if (playerScore >= 500) {
//            return 2;
//        }else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;    // return statement should only be called once! > see better solution below...

        int position = 4;   // assuming position 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;    // return statement should only be called once!

    }

}
