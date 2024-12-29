package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {
        long a = 2;
        long b = 3;
        long result = pow(a,b);

        System.out.println("Result = " + result);
    }

    /**
     * Calculates the power
     * @param a is base
     * @param n is power
     * @return the result
     */
    public static long pow(long a, long n) {
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= a;
//        }
//        return result;
        return (long) Math.pow(a,n);
    }
}
