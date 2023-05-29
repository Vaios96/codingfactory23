package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if the lights of a car
 * should be opened based on
 * if it is raining and on the same time
 * one of the following is also true:
 * it is dark, speed > 100
 * All of the above are stdin
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;


        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = speed > 100;
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
    }
}
