package gr.aueb.cf.projects;

import java.util.Scanner;

/**
 * This is a Tic Tac Toe app. 2 players take turns picking a spot to place their mark (X or O).
 * The winner is the one that will connect 3 of his/hers marks (horizontally, vertically or diagonally).
 * In case all 9 spots are filled and both of the players failed to connect their marks, the end game end in a draw.
 * The app checks for correct input (if the spot that the player picks is available and if the input is valid), if there
 * is a winner (in case there is, the game stops and announces the winner) and if there is a tie (in case there is, the game stops and announces the tied result).
 */
public class Project08TicTacToeApp {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void rulesOfTheGame() {
        System.out.println("Welcome to Tic-Tac-Toe! This a game for 2 players. You will have to decide who goes first");
    }
}
