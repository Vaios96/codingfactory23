package gr.aueb.cf.ch7;

/**
 * Concatenates 2 or more strings.
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Mr.";
        String firstname = "Vaios";
        String lastname = "Tsialkoutis";
        String fullName;
        String titledFullName;

        fullName = firstname + " " + lastname;
        System.out.println(fullName);

        fullName = title.concat(firstname).concat(lastname);
        System.out.println(fullName);
    }
}
