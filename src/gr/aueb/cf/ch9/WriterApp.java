package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt", StandardCharsets.UTF_8);
             PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")) {
            ps.println("Hello CF! from this print stream");
            pw.println("Hello CF! from this print writer");
            pw.flush();
        } catch (IOException e) {
            System.out.println("File path not found");
        }
    }
}
