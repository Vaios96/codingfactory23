package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Takes 3 input from the user:
 * a, b, c and checks if the triangle is rectangle
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        Scanner in = new Scanner(System.in);
        boolean isRight = false;

        System.out.println("Please insert 3 doubles, a, b ,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a * a - (b * b + c * c)) <= EPSILON;

        if (isRight) {
            System.out.println("Rectangle");
        } else {
            System.out.println("Not Rectangle");
        }
    }
}
