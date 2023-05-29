package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Decides based on the temperature
 * if it is <0 that is snows, else it is not snowing
 */

public class BoolFirstApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
