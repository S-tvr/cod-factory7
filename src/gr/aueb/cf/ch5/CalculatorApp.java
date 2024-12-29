package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * εμφανιζει ενα μενου επιλογων
 * ο χρηστης επιλεγει
 * αναλογα την επιλογη εκτελειται η αντιστοιχη πραξη
 * και εκτυπωνεται το αποτελεσμα
 * εκτελειται επαναληπτικα
 * μεχρι ο χρηστης να επιλεξει εξοδος
 */
public class CalculatorApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        int result;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isValid(choice)) {
                System.out.println("Error. Choice must be between 1 - 6");
                System.out.println("Try again");
                continue;
            }

            if (choice == 6) {
                System.out.println("Quiting....");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1. προσθεση.");
        System.out.println("2. αφαιρεση.");
        System.out.println("3. πολλαπλασιασμος.");
        System.out.println("4. Διαιρεση.");
        System.out.println("5. υπολοιπο διαιρεσης.");
        System.out.println("6. εξοδος.");
    }

    public static int getOneInt() {
        return sc.nextInt();
    }

    public static boolean isValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1;
        int num2;
        int result = 0;

        System.out.println("Please, give 2 numbers.");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add(int a,int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if(b == 0) return 0;
        return a/b;
    }

    public static int mod(int a, int b) {
        if(b == 0) return 0;
        return a % b;
    }
}
