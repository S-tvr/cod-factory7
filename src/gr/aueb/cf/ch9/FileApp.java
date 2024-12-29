package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {

        File fd = new File("C:\\Users\\Tsubn\\Desktop\\file7.txt");
        String line;
        String[] tokens;

        try (Scanner sc = new Scanner(fd)) {
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
