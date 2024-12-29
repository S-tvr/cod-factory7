package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr);
        ArraysInMethods.printArray(mapToDouble(arr));

    }

    // Filtering
    public static int[] getEvens(int[] arr) {

        // πρωτο περασμα για να δουμε το μεγεθος του πινακα
        int counter = 0;
        int pivot = 0;

        for(int el : arr) {
            if (el % 2 == 0) {
                counter++;
            }
        }

        int[] evens = new int[counter];

        for(int el : arr) {
            if(el % 2 == 0) {
                evens[pivot++] = el;

            }
        }
        return evens;
    }


    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            mapped[i] = 2 * arr[i];
        }
        return mapped;
    }

    //Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {

        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr){
        boolean isEven = false;

        for(int el : arr){
            if(el % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    public static boolean isMoreThanTwoEvens(int[] arr) {
        int count = 0;

        for(int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count > 2;
    }

    public static boolean isMoreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length - 2; i++ ) {
            if(arr[i] == arr[i+1] - 1 && arr[i] == arr[i + 2] - 2){
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean isMoreThanTwoWithSameEnding(int[] arr) {
        boolean isSameEnding = false;
        int[] endings = new int[10];

        for(int el : arr){
            endings[el % 10]++;
        }

        for(int el : endings) {
            if(el > 2) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean allAreEvens (int[] arr) {
//        return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for(int el : arr) {
            if (el % 10 == 0) count++;
        }

        return count == arr.length;
    }
}


