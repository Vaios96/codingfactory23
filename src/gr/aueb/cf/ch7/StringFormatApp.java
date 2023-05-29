package gr.aueb.cf.ch7;

/**
 * Formats to string.
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char ch = 'B';
        int num = 10;

        String seat = String.format("%c%02d", ch, num);

        System.out.println(seat);
    }
}
