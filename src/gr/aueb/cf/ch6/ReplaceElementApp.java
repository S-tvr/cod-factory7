package gr.aueb.cf.ch6;

public class ReplaceElementApp {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        replace(arr,4,8);

        printArray(arr);
    }

    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == - 1) {
            return;
        }

        arr[positionToUpdate] = newVal;
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

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}

