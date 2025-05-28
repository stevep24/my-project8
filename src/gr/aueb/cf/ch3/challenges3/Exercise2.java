package gr.aueb.cf.ch3.challenges3;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(" Διαλέξτε ενα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");


            choice = scanner.nextInt();

            if (choice == 5){
                System.out.println("“Επιλέξατε Έξοδος");
                break;
            }
            if (choice == 1){
                System.out.println("“Επιλέξατε Εισαγωγή");
            } else if ( choice == 2) {
                System.out.println("“Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("“Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("“Επιλέξατε Αναζήτηση");
            }else System.out.println("Λάθος επιλογή διαλέξτε ξανά");
        }
    }
}
