package gr.aueb.cf.ch4;

/**
 * Special for
 */
public class SpecialForApp {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("once");
        }

        for (int i = 1, j = 10; i < j; i++, j-- ) {
            System.out.println(i + ", " + j);
        }

        for(;;) {
            System.out.println("Forever");
            count++;
            if (count >= 10) break;
        }
    }
}
