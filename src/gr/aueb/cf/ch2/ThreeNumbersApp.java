package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks user for 3 ints
 * deducts 1 from them
 * and outputs them on given order
 * leaving 1 space between them
 */

public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1 = num1 - 1;
        num2 -= 1;
        num3--;

        System.out.printf("%d %d %d", num1, num2, num3);


    }
}
