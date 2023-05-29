package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints repetitively a menu
 * until the user decides to exit
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: \n 1. Εισαγωγή προϊόντς \n 2. Διαγραφή \n 3. Έξοδος");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
