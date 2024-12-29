package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *
 */
public class FlexibleForApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startVal = 0;
        int endVal = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please enter start, end and step");
        startVal = sc.nextInt();
        endVal = sc.nextInt();
        step = sc.nextInt();

        for ( int i = startVal; i <= endVal; i += step) {
            iterations ++;
            System.out.print( i + " " );
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);


    }
}
