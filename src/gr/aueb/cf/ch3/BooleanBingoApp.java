package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if-then-else with a boolean.
 */
public class BooleanBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;
        boolean bingo = false;

        while (!bingo) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET_KEY) {
                System.out.println("Please try again!");
                continue;
            }

            System.out.println("Bingo!");
            bingo = true;
        }
    }
}