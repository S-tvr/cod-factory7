package gr.aueb.cf.ch5;

/**
 * Calculates the factorial.
 * n! = 1 * 2 * 3 * 4 ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "!: " + facto(i));

        }
    }

    /**
     * Calculates the factorial
     * @param n is the number
     * @return the factorial
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
