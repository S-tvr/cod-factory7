package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert a num");
            num = sc.nextInt();
        }catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sc != null) sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
