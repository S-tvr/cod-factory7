package gr.aueb.cf.ch6;

public class ArrayMinMax2 {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int minPosition = getMinPosition(arr,1,3);

        System.out.println(minPosition);

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue)  {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if(arr == null || arr.length < 1) return -1;

        int maxValue = 0;
        int maxPosition = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded
     *  return the position with the lowest value σε εναν υποπίνακα
     * @param arr from array
     * @param low the lowest
     * @param high
     * @return lowest value
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        if(arr == null || arr.length < 1) return -1;
        if(low < 0 || high > arr.length - 1) return -1;
        if(low > high) return -1;

        int minPosition = 0;
        int minValue = arr[low];

        for(int i = low; i <= high; i ++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }


        return minPosition;
    }
}
