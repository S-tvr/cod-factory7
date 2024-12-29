package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTastingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert a numerator");
        while(!sc.hasNextInt()) {
            System.out.println("Error. Input must be int. Please insert a numerator");
            sc.nextLine();          // το καταναλώνω για να καθαρίσει.
        }
        numerator = sc.nextInt();

        System.out.println("Please insert a denominator");
        while(!sc.hasNextInt()) {
            System.out.println("Error. Input must be int. Please insert a denominator");
            sc.nextLine();          // το καταναλώνω για να καθαρίσει.
        }
        denominator = sc.nextInt();

        if (denominator == 0 ) {
            System.out.println("Error. Denominator must not be zero.");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);




    }
}
