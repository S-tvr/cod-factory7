package gr.aueb.cf.ch6;

/**
 * copies the reference of the array.
 * it is a shallow copy. there are side effects.
 */
public class ArrayReferenceCopy {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arrRefCopy = arr;             // shallow copy.

        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }

        System.out.println();

        arrRefCopy[4] = 100;

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
