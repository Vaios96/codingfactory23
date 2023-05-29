package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads from stdin the
 * start-value, end-value, step
 * and prints the numbers of repetitions
 */

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please provide start, end and step values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations: " + iterations);
    }
}
