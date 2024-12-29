package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();     // Χρησιμοποιώ την κλαση stringbuilder, γιατι δεν ειναι immutable,
        // αρα δεν θα δημιουργει πολλα νεα στρινγκ αλλα ενα και θα προσθετει.

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/Users/Tsubn/Desktop/file7.txt"))) {
            String line = "";

            while ((line = bf.readLine() ) != null) {
                sb.append(line).append("\n");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
