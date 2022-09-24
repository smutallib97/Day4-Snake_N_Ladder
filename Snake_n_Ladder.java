package com.bridgelabz.snake_n_ladder;

public class Snake_n_Ladder {
    public static void main(String[] args) {
        //System.out.println("Welcome to Snake_N_Ladder Computation Program");
        //UC1

        // starting position of player
        int startPosition = 0;
        System.out.println(" Start position is: " + startPosition);

        //UC2
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Dice Number is : " + diceNumber);
    }
}
