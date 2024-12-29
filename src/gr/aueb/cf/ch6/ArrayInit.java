package gr.aueb.cf.ch6;

/**
 * Δηλωση και αρχικοποιηση ενος πινακα
 * Populate εναν πινακα
 * - new
 * - unsized init
 * - array initializer
 * - print
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];                 // Declare and initiate
        int[] arr2 = {1, 2, 3, 4, 5};           //Unsized initialization. to new ennoeitai
        int[] arr3 ;
        arr3 = new int[] {1, 2, 3, 4, 5};       // array initializer

        //Populate
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        // traverse / print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // enhanced for
        for (int el : arr2) {
            System.out.print(el + " ");
        }
    }
}
