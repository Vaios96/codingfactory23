package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Iteratively presents a multi-choice menu.
 * The user selects a choice and gets feedback.
 * Q/q is quit.
 */
public class ProjectCh3 {
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

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
        System.out.println("Q or q to Quit");
    }

    public static String getChoice() {

        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) {
        int choice = -1;

        try {
            if (s == null) throw new IllegalArgumentException();

            choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("Inserted");
                    break;
                case 2:
                    System.out.println("Updated");
                    break;
                case 3:
                    System.out.println("Deleted");
                    break;
                case 4:
                    System.out.println("Selected");
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
