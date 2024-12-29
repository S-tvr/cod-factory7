package gr.aueb.cf.ch4;

/**
 *  Prints different outputs of stars
 */
public class StarsApp {

    public static void main(String[] args) {

        //10 horizontal
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }

        //10 vertical
        for (int i = 0; i < 10; i++) {
            System.out.println('*');
        }

        //10x10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ascending
        // 1x1 2x2 3x3 etc.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Descending 1st example
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 10; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Descending 2nd example
        for (int i = 1; i <= 10 ; i++) {
            for (int j = i; j <= 10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Explanation of 2nd example
        for (int i = 1; i <= 10; i++) {
            int j = i;
            while (j <= 10) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}
