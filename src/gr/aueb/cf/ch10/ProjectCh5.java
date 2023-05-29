package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Prints stars.
 */
public class ProjectCh5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response = "";

        do {
            printMenu();
            response = getChoice();
            if (response.matches("[Qq]")) {
                quit = true;
            } else {
                try {
                    printOnChoice(response);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Choice");
                }
            }
        } while (!quit);
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal Stars");
        System.out.println("2. Vertical Stars");
        System.out.println("3. HV Stars");
        System.out.println("4. HV Asc Stars");
        System.out.println("5. HV Desc Stars");
        System.out.println("Q or q to Quit");
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printOnChoice(String s) {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalArgumentException();
            choice = Integer.parseInt(s);
            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Please insert the number of stars");
                n = Integer.parseInt(getChoice());
            }
            switch (choice) {
                case 1:
                    printStarsH(n);
                    break;
                case 2:
                    printStarsV(n);
                    break;
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    printStarsHVAsc(n);
                    break;
                case 5:
                    printStarsHVDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }
}
