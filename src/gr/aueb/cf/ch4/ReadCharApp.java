package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Read a char type
 */
public class ReadCharApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a char");
//        ch = (char) System.in.read();
        ch = sc.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
