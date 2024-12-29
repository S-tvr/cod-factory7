package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and a denominator");
                numerator = sc.nextInt();
                if (numerator == 0) break;

                denominator = sc.nextInt();
                result = numerator/ denominator;

                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.err.println("Error. Denominator must not be zero");
            }
        }

        System.out.println("Thnx for using the app");
    }
}
