package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * One airplane has 2 tanks.
 * If one of the tanks has less fuel than 1/4 of the maximum capacity, an orange light is lit up
 * If both of them have less than 1/4 a red signal is lit up.
 * The pilot (user) provides true/false based on the tanks capacity ( < 1/4 or not)
 */

public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4 (true/false)");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
