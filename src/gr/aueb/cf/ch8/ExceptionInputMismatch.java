package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException } συμβα'ίνει οταν
 * scanner αποττύγχάνει να διαβάσει το σωστό data type
 */
public class ExceptionInputMismatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        // num1 = scanner.nextInt(); Δίνει InputMismatch αν δοθεί non-int

        while(!scanner.hasNextInt()){
            System.out.println("Μη αποδεκτοί χαρακτήρες. Παρακαλώ εισάγετε ακέραιο");
            scanner.nextLine();
        }
        num1 = scanner.nextInt();
        System.out.println(num1);
    }
}
