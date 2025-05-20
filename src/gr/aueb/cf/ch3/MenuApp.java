package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει εξακολουθητικα ενα μενου επιλογων μεχρι ο χρηστης να δωσει 'exit'.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 3;

        do {
            System.out.println("Παρακαλω επιλεξτε μεταξυ των παρακατω:");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Διαγραφη προιοντος");
            System.out.println("3. Εξοδος");
            choice = scanner.nextInt();

        }while (choice != EXIT);
        System.out.println("Ευχαριστουμε που χρησιμοποησατε την εφαρμογη μας");

    }
}
