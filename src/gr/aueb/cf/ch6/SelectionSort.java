package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 14, 8};

        selectionSort(arr);

        for(int el : arr) {
            System.out.println(el);
        }
    }

    public static int[] selectionSort(int[] arr) {


        for(int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            int minValue = arr[i];

            for(int j = i ; j < arr.length; j++){
                if(arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j) {
        int tempVal = arr[i];
        arr[i] = arr[j];
        arr[j] = tempVal;

    }
}
