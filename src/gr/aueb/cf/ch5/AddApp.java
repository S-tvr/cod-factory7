package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * πολογιζει το αθροισμα 2 ακεραιων με την χρήση μεθόδων.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int sum;
        int sub;

        System.out.println("Please provide a and b");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = AddApp.add(a,b); // If you are inside the same class, you can use only add.
        sub = AddApp.sub(a,b); // in every other occasion you have to use the full name.

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * adds to integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum
     */
    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
//        return result;
        return a + b;
    }

    /**
     * substracts
     * @param a substracts from number
     * @param b the number
     * @return the result
     */
    public static int sub (int a, int b) {
        return a-b;
    }
}
