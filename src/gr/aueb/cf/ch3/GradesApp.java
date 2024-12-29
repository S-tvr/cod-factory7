package gr.aueb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει:
 * 1. τους συνολικούς βαθμούς μαθημάτων
 * 2. το πλήθος των μαθημάτων
 *
 * Θα υπολογίζει τον μέσο όρο και θα χαρακτηρίζει
 * 'Άριστα' αν ο μ.όρος είναι >= 9, 'Πολύ καλά' αν
 * ο μέσος όρος είναι >= 7 και "Καλώς" αν 0 μέσος
 * όρος είναι >= 5 και 'Αποτυχία' αν ο μ.όρος είναι
 * < 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please enter the total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0 ) {
            System.out.println("Total marks must be higher than 0");
            System.exit(1);
        }

        System.out.println("Please, enter the number of courses");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Invalid courses number");
            System.exit(1);
        }

        average = totalMarks/ coursesCount;

        if (average > 10) {
            System.out.println("The average must be less or equal than 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Great");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Failure");
        }


    }
}
