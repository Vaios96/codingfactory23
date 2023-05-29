package gr.aueb.cf.ch4;

/**
 * Never ending for loop.
 */
public class SpecialForCaseApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            counter++;
            System.out.print("forever ");
            if (counter % 10 == 0) System.out.println();
            if (counter == 50) break;
        }
    }
}
