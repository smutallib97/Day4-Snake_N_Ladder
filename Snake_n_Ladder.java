package com.bridgelabz.snake_n_ladder;

public class Snake_n_Ladder {
    public static void main(String[] args) {
        //System.out.println("Welcome to Snake_N_Ladder Computation Program");
        //UC1

        System.out.println("Player Exact Winning Position is: ");

//		constants for program
        int WINNING_POSITION = 100;
        int position = 0; // Initializing Variable

        // while loop use to execute Condition
        while (position < WINNING_POSITION) {

            // to roll a dice
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("DiceNumber is : " + diceNumber);

            // check option after getting a diceNumber
            int option = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("Selected player option : " + option);

            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Ladder");
                    if (position > 100) {
                        position = 100;
                        position = position - diceNumber;
                    }
                    System.out.println("Position for the player after the ladder is : " + position);
                    break;

                case 2:
                    position = position - diceNumber;
                    System.out.println("Snack");
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player restart from zero: ");
                    }
                    System.out.println("Position for the player after the Snake is : " + position);
                    break;

                default:
                    System.out.println("No play");

                    // UC6
                    int count = 0; // number of times die was rolled
                    int count1s = 0; // number of times 1 was rolled
                    int count2s = 0; // number of times 2 was rolled
                    int count3s = 0;
                    int count4s = 0;
                    int count5s = 0;
                    int count6s = 0;

                    while (count < 100) {
                        count1s = (int) (Math.random( )*6 + 1);
                        count2s = (int) (Math.random( )*6 + 1);
                        count3s = (int) (Math.random( )*6 + 1);
                        count4s = (int) (Math.random( )*6 + 1);
                        count5s = (int) (Math.random( )*6 + 1);
                        count6s = (int) (Math.random( )*6 + 1);

                        count++;

                    }
                    System.out.println("Number of times the Dice was rolled: "+ count);
                    System.out.println("Number of times 1 was rolled: " + count1s);
                    System.out.println("Number of times 2 was rolled: " + count2s);
                    System.out.println("Number of times 3 was rolled: " + count3s);
                    System.out.println("Number of times 4 was rolled: " + count4s);
                    System.out.println("Number of times 5 was rolled: " + count5s);
                    System.out.println("Number of times 6 was rolled: " + count6s);

            }
        }
    }
}