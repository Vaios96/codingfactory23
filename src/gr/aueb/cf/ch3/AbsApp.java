package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary operator
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide an int");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.println("Abs: " + abs);
    }
}
