/*
 * 
 * © CozyCode 2024
 * All rights reserved.
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class Game {

    String p1Name;
    String p2Name;
    int p1Score = 0;
    int p2Score = 0;
    int currentPlayer;

    public Game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player 1 Name:");
        p1Name = sc.nextLine();
        System.out.println("Enter Player2 Name:");
        p2Name = sc.nextLine();
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        currentPlayer = (int) (Math.random() + 1);

        boolean done = false;

        while (!done) {

            System.out.println("It is Player " + currentPlayer + "'s turn. There are " + Board.getNumPieces() + " pieces on the board.");
            System.out.println("How many pieces do you want to remove?");
            int amount = sc.nextInt();

            if (amount > Board.getNumPieces()/2 && amount != 1 || amount < 1) {
                System.out.println("That is an invalid number of pieces!");
                System.out.println("Inputted number should be less than half of the current game pieces, but no less.");
                continue;
            }

            // Remove pieces from board
            Board.subNumPieces(amount);

            // Check if there aren't any pieces left
            if (Board.getNumPieces() < 1) {
                if (currentPlayer == 1) {
                    p2Score++;
                    System.out.println("Player 2 wins the round!");
                } else {
                    p1Score++;
                    System.out.println("Player 1 wins the round!");

                }
                System.out.println("The current score is " + p1Score + " to " + p2Score + ".");

                done = true;
                continue;
            }




            if (currentPlayer == 1) {
                currentPlayer++;
            } else {
                currentPlayer--;
            }

        }

    }
}
