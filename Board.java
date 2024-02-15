/*
 * 
 * © CozyCode 2024
 * All rights reserved.
 * 
 */
import java.lang.Math;
public class Board {

    private static int numPieces;

    public static void populate() {
        numPieces = (int) (Math.random() * 41) + 10;
    }

    public static int getNumPieces() {
        return numPieces;
    }

    public static void subNumPieces(int num) {
        numPieces -= num;
    }
}

