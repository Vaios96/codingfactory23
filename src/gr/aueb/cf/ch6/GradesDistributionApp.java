package gr.aueb.cf.ch6;

/**
 * Takes an array of integer grades as input (0-100) and
 * prints the distribution of the grades with "*".
 */
public class GradesDistributionApp {
    public static void main(String[] args) {
        int[] grades = {30, 9, 12, 22, 28, 29, 21, 34, 44, 46, 47, 48, 49, 55, 67, 89, 90, 95, 100};
        int[] count = new int[10];

        for (int grade : grades) {
            if (grade == 100) count[9]++;
            else {
                count[grade / 10] += 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%02d - %02d: ", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for (int j = 1; j <= count[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
