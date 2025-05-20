package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εκφραζει τη λογικη της do-while αλλα με την χρηση αεναου while-do και sentinel
 */

public class MenuApp2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int EXIT = 3;
        int choice = 0;


        while (true){
            System.out.println("Παρακαλω επιλεξτε μεταξυ των παρακατω:");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Διαγραφη προιοντος");
            System.out.println("3. Εξοδος");
            choice = scanner.nextInt();
            if (choice == EXIT){
                break;
            }
        }
        System.out.println("Ευχαριστουμε που χρησιμοποησατε την εφαρμογη μας");
    }

}
