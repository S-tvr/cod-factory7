package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common
 * use case, that is conditional assignment.
 * abs(num) always positive.
 */
public class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please, enter a num");
        num = sc.nextInt();

//        if (num > 0) abs = num;
//        else abs = -num;

        abs = (num >= 0) ? num : -num;

        System.out.println("The absolute of num: " + num + " is: " + abs);
    }
}