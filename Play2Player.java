package com.bridgelabz.snake_n_ladder;
import java.util.Random;
import java.util.Scanner;
    public class Play2Player {
        public static void main(String[] args) {
            Random rand = new Random();
            Scanner keyboard = new Scanner(System.in);

            int Player1TotalScore = 0;
            int Player2TotalScore = 0;
            int PlayerSubTotal = 0;
            boolean run = true;
            String response;
            int roll = 0;

            do {
                System.out.println("Player1 Turn");
                run = true;
                do {
                    roll = 1 + rand.nextInt(6);
                    System.out.println("Player1 rolled " + roll + ".");


                    if (roll == 1)
                    {
                        System.out.println("Player1 score: " + Player1TotalScore + "Player2 score: " + Player2TotalScore);

                        run = false;
                    } else {
                        Player2TotalScore += roll;
                        System.out.println("Player1score: " + Player1TotalScore + "Player2score: " + Player2TotalScore);

                        if (Player1TotalScore >= 100) {
                            run = false;
                        } else {
                            System.out.print("Enter 'r' to roll again or 'h' to hold: ");
                            response = keyboard.next();
                            if (response.equalsIgnoreCase("h")) {
                                run = false;
                            }
                        }

                    }
                } while (run);

                if (Player1TotalScore < 100) {
                    System.out.println("\nPlayer2 Turn");

                    Player2TotalScore = 0;
                    run = true;
                    do {
                        roll = 1 + rand.nextInt(6);
                        System.out.println("Player2 rolled " + roll + ".");

                        if (roll == 1) {
                            System.out.println("Player1 score: " + Player1TotalScore + " Player2 score: " + Player2TotalScore);
                            run = false;
                        } else {
                            Player1TotalScore += roll;
                            Player2TotalScore += roll;
                            System.out.println("Player1 score: " + Player1TotalScore + " Player2 score: " + Player2TotalScore);

                            if (Player2TotalScore >= 20) {
                                System.out.println("Player2 subtotal >= 20.");
                                run = false;
                            }

                            if (Player2TotalScore >= 100) {
                                run = false;
                            }
                        }
                    } while (run && Player2TotalScore < 20);
                }
                System.out.println();
            } while (Player1TotalScore < 100 && Player2TotalScore < 100);

            if (Player1TotalScore >= 100)
                System.out.println("Player1 win the game");
            else
                System.out.println("Player2 win the game");

            keyboard.close();
        }
    }
}
