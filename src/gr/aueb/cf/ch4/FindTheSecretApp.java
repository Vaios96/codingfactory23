package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user has 10 chances to find a secret key.
 * If he finds it sooner, the for loop breaks.
 */

public class FindTheSecretApp {

    public static void main(String[] args) {
        final int SECRET_KEY = 12;
        Scanner in = new Scanner(System.in);
        int num;
        boolean found = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries, play again");
            System.exit(1);
        }

        System.out.println("Success! Play again!");
    }

}
