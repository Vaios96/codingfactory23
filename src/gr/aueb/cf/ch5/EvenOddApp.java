package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Decides if a number is even or odd
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);
        System.out.printf("Num %d is even: %b", num, isNumEven);
    }

    /**
     * Evaluates if an int is even or not
     *
     * @param n     the number to be evaluated
     * @return      true, if n is even, else false
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
