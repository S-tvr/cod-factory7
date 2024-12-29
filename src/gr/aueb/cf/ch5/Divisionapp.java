package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Double division demo
 */
public class Divisionapp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2 = 0d;
        double div = 0d;
        double mod = 0.0;

        System.out.println("Please, enter numerator and denominator");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %5.2f\n", div);
        System.out.printf("Mod: %5.2f", mod);
    }
}
