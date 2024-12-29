package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

// to order των exceptions, αν δεν ειναι τελειως ανεξαρτητα παει απο το ειδικο στο γενικο
public class MultipleExceptionApp {

    public static void main(String[] args) throws IOException {
        File file  = new File("C:/tmp/file.txt");

        try (Scanner sc = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = sc.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
//            throw e;
        } catch (IOException e) {
            System.err.println("IO exception");
//            throw e;
        } catch (Exception e) {
            System.err.println("Generic order");
            e.printStackTrace();
        }
    }
}
