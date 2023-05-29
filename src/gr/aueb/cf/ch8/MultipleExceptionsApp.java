package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e2) {
            System.out.println("File not found Error");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Read Error");
        } catch (Exception e3) {
            System.out.println("Ooopssss something went wrong!");
        }
    }
}
