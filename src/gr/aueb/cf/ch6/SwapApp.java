package gr.aueb.cf.ch6;
// ολες οι συνθετες δομες ( πινακες, κλασσεις, strings) περνάνε κατα αναφορά.
// σε όλες τις γλώσσες προγραμματισμού.
public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1,2};
        swap(arr);
        printArr(arr);

    }

    public static void swap(int[] arr) {
        if (arr.length!= 2) return;

// this doesn't work cause it creates a new place in heap and doesn't change the existing ones.
//        int a = arr[0];
//        int b = arr[1];
//        int temp;
//        temp = a;
//        b = a;
//        a = temp;

        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
    }

    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
