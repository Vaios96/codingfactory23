package gr.aueb.cf.ch3;

/**
 * Calculates the sum and the multiple of the first 10 ints
 */
public class SumAndMul10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
