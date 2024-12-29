package gr.aueb.cf.ch6;

public class ArrayMinAndMax {

    public static void main(String[] args) {
        int minPosition = 0;
        int[] arr = {5, 4, 3, 3, 1};

        minPosition = getMinPosition(arr);

        System.out.println(minPosition);

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

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
        int maxPosition = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
