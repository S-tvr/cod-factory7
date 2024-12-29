package gr.aueb.cf.ch8;

/**
 * εδω δεν ειναι σωστο να κανουμε try/ catch. (να το συγκαλείωουμε)
 * Πρεπει να τα βρουμε και να το διορθώσουμε.
 */
public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
