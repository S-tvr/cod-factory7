package gr.aueb.cf.ch5;

/**
 * recursive means that it calls itself
 * με μικροτερο αριθμο δεδομενων εισοδου.
 *
 * Βασικες αρχες ειναι οτι σπαμε το προβλημα σε μικροτερα προβληματα μα την ιδια λογικη
 * και χρειαζομαστε μια base τιμη για να βγουμε απο το recursiveness
 */
public class FactorialRecursive {

    public static void main(String[] args) {
//        int num = facto(5);
//        System.out.println(num);
        for(int i = 1; i <= 10; i++) {
            System.out.println(facto(i));
        }

    }

    public static int facto(int n) {
        if (n <= 1) return 1;
        return facto(n - 1) * n;
    }
}
