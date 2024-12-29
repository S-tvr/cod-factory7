package gr.aueb.cf.ch6;

public class CircularRotation {

    public static void main(String[] args) {

    }

    public static int[] doLeftShift (int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    // το % arr.length καλουπονει οτι του ερχεται για να μεινει εντος ορίων
    // μονο που το βαζει στην αρχη μετα, αντι για το τελος

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }
}
