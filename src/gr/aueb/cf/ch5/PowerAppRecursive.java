package gr.aueb.cf.ch5;

/**
 * recursive version of powerApp
 * a^n = a * a^(n - 1) = a * a(n - 1) * a (n-2)
 */
public class PowerAppRecursive {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(pow(2,i));
        }


    }

    public static long pow(int a, int n) {
        if (n == 0) return 1;
        return a * pow(a, n - 1 );
    }

}
