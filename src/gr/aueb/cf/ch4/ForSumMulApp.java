package gr.aueb.cf.ch4;

/**
 * Calculates the sum and mul of first 10 numbers
 */

public class ForSumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i
            mul *= i; // mul = mul * i
        }

        System.out.printf("Sum = %d \n Mul = %d", sum, mul);

    }
}
