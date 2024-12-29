package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντιγραφει ενα pdf(ως binary)
 */
public class PdfBufferedCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; // 8kb

        try (FileInputStream fis = new FileInputStream("C:/Users/Tsubn/Desktop/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Users/Tsubn/Desktop/dummy-copy.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχειο με μέγεθος %.1fKB (%d bytes) αντιγράφηκε επιτυχώς\n",(counter / 1024.0), counter);
            System.out.println("Elapsed time: " + elapsedTime + " seconds");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
