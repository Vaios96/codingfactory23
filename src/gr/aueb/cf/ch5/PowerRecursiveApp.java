package gr.aueb.cf.ch5;

/**
 * Calculates a^n using recursion
 */

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    /**
     * Recursive a^n.
     *
     * @param a     the base
     * @param n     the power
     * @return      the power of a.
     */
    public static float power(float a, float n) {
        if (n < 0) {
            return 1 / power(a, -n);
        } else if (n == 0) {
            return a;
        } else {
            return a * power(a, n - 1);
        }
    }
}
