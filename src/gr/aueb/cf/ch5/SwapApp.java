package gr.aueb.cf.ch5;

/**
 * Mutually exchanges the value of the two variables
 * ex. a takes the value of b and b takes the value of a.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

        System.out.println("a equals to: " + a + " and b equals: " + b);

    }

    /**
     * exchange values
     * @param a first input
     * @param b second input
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
