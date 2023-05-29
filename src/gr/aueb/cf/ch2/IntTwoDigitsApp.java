package gr.aueb.cf.ch2;

/**
 * User inputs one two digit integer
 * the program prints the sum of the 2 digits
 */

import java.util.Scanner;

public class IntTwoDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDgit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a num with two digits");
        num = in.nextInt();

        leftDgit = num / 10;
        rightDigit = num % 10;
        sumOfDigits = leftDgit + rightDigit;

        System.out.println("Sum: " + sumOfDigits);

    }
}
