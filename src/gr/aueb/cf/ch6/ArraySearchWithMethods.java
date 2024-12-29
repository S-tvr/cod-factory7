package gr.aueb.cf.ch6;

public class ArraySearchWithMethods {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int position;

        position = getPosition(arr, 4);

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.printf("Value %d found in position %d", arr[position], (position + 1));
        }

    }

    public static int getPosition (int[] arr, int value) {
        int positionToReturn = -1; //invalid value so that we detect false

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
