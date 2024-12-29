package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 1};

        bubbleSort(arr);

        ArraysInMethods.printArray(arr);

    }

    public static int[] bubbleSort(int[] arr) {
        for(int i = arr.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j) {
        int tempVal = arr[i];
        arr[i] = arr[j];
        arr[j] = tempVal;

    }

}
