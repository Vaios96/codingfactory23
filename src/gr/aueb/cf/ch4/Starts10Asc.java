package gr.aueb.cf.ch4;

/**
 * Prints in ascending order, a number of "*"
 */
public class Starts10Asc {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
