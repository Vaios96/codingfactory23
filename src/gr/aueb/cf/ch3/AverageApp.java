package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the average score of a student.
 * Total and count are provided.
 */

public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count <= 0) {
            System.out.println("Invalid count");
            System.exit(1);
        }

        if (total < 0) {
            System.out.println("Invalid total");
            System.exit(1);
        }

        average = total / count;

        if (average > 10) {
            System.out.println("Invalid average");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }


    }
}
