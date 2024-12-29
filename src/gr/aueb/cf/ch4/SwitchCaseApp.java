package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo Switch case
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. one player game");
            System.out.println("2. two player game");
            System.out.println("3. multiplayer game");
            System.out.println("4. Quit.");

            choice = sc.nextInt();

            // Check if user input is valid
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
                System.out.println("Try again.");
                continue;
            }

//            if (choice == 1) {
//                System.out.println("One player game started.");
//            } else if (choice == 2) {
//                System.out.println("Two player game started.");
//            } else if (choice == 3) {
//                System.out.println("Multi player game started.");
//            } else {
//                System.out.println("Quiting...");
//            }

            switch (choice) {
                case 1:
                    System.out.println("One player game started.");
                    break;
                case 2:
                    System.out.println("Two player game started.");
                    break;
                case 3:
                    System.out.println("Multi player game started");
                    break;
                case 4:
                    System.out.println("Quiting...");
                default:
                    System.out.println();


            }

        } while (choice != 4);
    }
}
