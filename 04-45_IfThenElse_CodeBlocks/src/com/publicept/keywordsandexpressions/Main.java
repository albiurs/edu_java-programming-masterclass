package com.publicept.keywordsandexpressions;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score < 5000 but > 1000");
        } else if (score < 1000) {
            System.out.println("Score < 1000"); // Score < 1000
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finaleScroe = score + (levelCompleted * bonus); // 800 + (5 * 100)
            System.out.println("Final score: " + finaleScroe); // Final score: 1300
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScroe = score + (levelCompleted * bonus); // 10_000 + (8 * 200)
            System.out.println("Final score: " + finalScroe); // Final score: 11600
        }
    }
}
