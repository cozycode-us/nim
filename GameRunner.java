/*
 * 
 * © CozyCode 2024
 * All rights reserved.
 * 
 */

import java.util.Scanner;
public class GameRunner
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Game of Nim!");
        System.out.println("On your turn, select an amount of pieces to remove from the table, greater than one but less than half of all game pieces on the board");
        System.out.println("The last person to remove pieces, loses.");

         // static method call

        Game nim = new Game();
        boolean playAgain = true;
        while (playAgain) {
            Board.populate();
            nim.play();
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to play again? (y/n)");
            if (sc.nextLine().equals("y")) {
                continue;
            } else {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }

    }
}