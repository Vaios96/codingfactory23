package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String substring = s.substring(0, 5);

        System.out.println(substring);


//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i) + " ");
//        }
//
//        System.out.println("\u2764");
//
//        int index = s.indexOf("Cod");
//        int index2 = s.indexOf("od");
//        int index3 = s.indexOf("o");
//        int index4 = s.indexOf("o", 7);
//        int index5 = s.lastIndexOf("o");
//
//        System.out.println(index);
//        System.out.println(index2);
//        System.out.println(index3);
//        System.out.println(index4);
//        System.out.println(index5);
//
//        if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
