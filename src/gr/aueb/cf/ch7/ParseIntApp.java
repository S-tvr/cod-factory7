package gr.aueb.cf.ch7;

import java.util.Scanner;

// οτιδηποτε γραφουμε στην κονσολα ειναι string και μετα γινεται η μετατροπη
public class ParseIntApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String s;

        System.out.println("Please insert an int");
        s = sc.nextLine();

        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
