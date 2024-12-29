package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = sc.next();             // διαβαζει μεχρι να βρει whitespace. (space, \t, \n)
        s2 = sc.nextLine();         // μεχρι \n.

        System.out.printf("s1: %s\ns2: %s",s1, s2);
    }
}
