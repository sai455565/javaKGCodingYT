package org.example.expressionAndStatementAndMore;

public class MainChallenge {
    public static void main(String[] args) {
        calculateScore();

    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonos = 200;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted*bonos);
            System.out.println(finalScore);
        }
    }
}