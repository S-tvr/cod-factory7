package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethods {

    public static void main(String[] args) {
//        try (PrintStream ps = new PrintStream("C:/Users/Tsubn/Desktop/file8.txt", StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/Users/Tsubn/Desktop/file8.txt", true),
                true,StandardCharsets.UTF_8)) {
            ps.printf("The current time is: %tT\n", System.currentTimeMillis());
            printMessage(ps, "Hello Coding Factory");
            printMessage(System.out,"Hello CF");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Generic PrintStream method
     * @param ps            the input PrintStream
     * @param message       the input message
     */
    public static void printMessage (PrintStream ps, String message) {
        ps.println(message);

    }
}
