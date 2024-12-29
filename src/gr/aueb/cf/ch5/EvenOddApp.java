package gr.aueb.cf.ch5;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Is even: " + isEven(num));
        System.out.println("Is odd: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Delegation design pattern
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}

