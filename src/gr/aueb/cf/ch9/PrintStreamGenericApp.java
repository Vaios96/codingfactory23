package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");

        printMessage(ps, "Hello World!");
        printMessage(System.out, "Hello Coding Factory!");
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
