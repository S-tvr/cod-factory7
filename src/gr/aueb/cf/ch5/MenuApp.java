package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενου επιλογών και ο χρήστης επιλέγει
 * μια επιλογή.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Choice was not valid.");
                continue;
            }
            doOnChoice(choice);
        }while(choice != 5);



        System.out.println("Quiting...");
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω");
        System.out.println("1. Εισαγωγή.");
        System.out.println("2. Αναζήτηση.");
        System.out.println("3. Ενημέρωση.");
        System.out.println("4. Διαγραφή.");
        System.out.println("5. Έξοδος.");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("αρχη εισαγωγής");
                break;
            case 2:
                System.out.println("αρχη αναζήτησης");
                break;
            case 3:
                System.out.println("αρχη ενημέρωσης");
                break;
            case 4:
                System.out.println("αρχη διαγραφης");
                break;
            case 5:
                System.out.println("Εξοδος");
                break;
            default:
                System.out.println("error");
                break;
        }
    }


}
