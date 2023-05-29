package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Please insert 2 ints: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            System.out.println("Please be careful of diving by 0");
//        }

        if (num2 == 0) {
            System.out.println("Please...");
            System.exit(1);
        }

        result = num1 / num2;

        System.out.println(result);
    }
}
