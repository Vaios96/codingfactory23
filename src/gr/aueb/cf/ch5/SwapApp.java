package gr.aueb.cf.ch5;

/**
 * Trades mutually two integers provided by the user.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Swaps a, b, so a -> b, b ->a.
     *
     * @param a     the first value.
     * @param b     the second value.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
