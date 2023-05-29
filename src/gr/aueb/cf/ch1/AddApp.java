package gr.aueb.cf.ch1;

/**
 * Adds two integers
 * and shows the result
 * at stdout
 */
public class AddApp {
    public static void main(String[] args) {
        //Declaration
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //Commands
        result = num1 + num2;

        //Printing results
        System.out.printf("The result of %d + %d is: %d", num1, num2, result);
    }
}
