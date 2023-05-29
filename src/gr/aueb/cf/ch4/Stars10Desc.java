package gr.aueb.cf.ch4;

/**
 * Prints in descending order, a number of "*"
 */
public class Stars10Desc {

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}