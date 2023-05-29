package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Euros to American Dollars
 * Takes input from stdin one int
 * that reflects the amount of Euros,
 * converts it to USD
 * and shows the final result.
 */

public class EuroToUsdConverterApp {
    //Declaration and Initialization
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Commands
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Results printing
        System.out.printf("%d Euros = %d USA dollaras, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
