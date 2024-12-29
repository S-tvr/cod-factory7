package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File fdIn = new File("C:/Users/Tsubn/Desktop/file7.txt");
        File fdOut = new File("C:/Users/Tsubn/Desktop/file7-out.txt");
        String line;
        String[] tokens;

        try (Scanner sc = new Scanner(fdIn);
             PrintStream ps = new PrintStream(fdOut, StandardCharsets.UTF_8)) {

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ",token.trim());
//                    ps.flush();  // γραφει αμέσως στο αρχείο
                }
                System.out.println();
                ps.println();
                ps.printf("Current time: %tT%n", System.currentTimeMillis());
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
