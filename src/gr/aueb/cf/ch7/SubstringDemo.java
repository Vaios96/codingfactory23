package gr.aueb.cf.ch7;

public class SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i+1);
            System.out.println(substring);
        }
    }
}
