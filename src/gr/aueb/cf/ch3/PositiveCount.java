package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετραει το πληθος των συνεχόμενων θετικων ακεραιων
 * (συμπεριλαμβανομενου και το 0) που δινει ο χρηστης)
 */
public class PositiveCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int positiveCount = 0;

        System.out.println("Παρακαλω δωστε μια ακολουθια συνεχομενων θετικων ακεραιων: ");
        num = scanner.nextInt();
        while (num >= 0){
            positiveCount++;
            System.out.println("αρακαλω δωστε τον επομενο ακεραιο: ");
            num = scanner.nextInt();
        }
        System.out.println("Positive Count :" + positiveCount);
    }

}
