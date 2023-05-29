package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints an amount of "*' horizontally
 * The amount is inserted by the user
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;

        System.out.println("Please insert an amount");
        numberOfStars = in.nextInt();

        while (i < numberOfStars) {
            System.out.print("*");
            i++;
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
