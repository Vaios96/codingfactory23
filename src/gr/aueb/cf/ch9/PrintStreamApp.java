package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Prints with PrintStream
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt")) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
