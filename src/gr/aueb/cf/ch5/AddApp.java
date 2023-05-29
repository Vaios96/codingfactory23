package gr.aueb.cf.ch5;

/**
 * Adds two integers by using add method
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.println(sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;
    }
}
