package gr.aueb.cf.ch4;

/**
 * Prints 10 rows of 10 "*"
 */

public class Stars10x10 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
