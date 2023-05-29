package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * A small frog wants to cross a river.
 * Frog is located at position X and wants
 * to reach Y (or > Y). he frog jumps a fixed
 * distance D.
 *
 * This app finds the minimum number of jumps that the frog needs to make
 * to reach or pass the destination.
 *
 * As an example if:
 * X = 10
 * Y = 85
 * D = 30
 *
 * then the frog needs to make 3 jumps.
 */

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curPos;
        int dest;
        int jump;
        int numJumps = 0;

        System.out.println("Please provide 3 integers for: current position, destination and jump");
        curPos = in.nextInt();
        dest = in.nextInt();
        jump = in.nextInt();

        for (;;) {
            numJumps++;
            curPos += jump;
            if (curPos >= dest) break;
        }

        System.out.println("Number of jumps required: " + numJumps);
    }
}
