package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Count the amount of positive integers that the user provides
 */

public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give an int");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give an int");
            num = in.nextInt();
        }

        System.out.println("Positive=count: " + positiveCount);
    }
}
