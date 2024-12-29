package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Check if triangle is right;
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.println("Please enter a, b, c. A is the longest line.");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if ( Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }


    }
}
