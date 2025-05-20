package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Συντομος κωδικας για την εισαγωγη
 * απο τον χρηστη ακεραιων μεχρι να βρεθει το -1
 */
public class SentinelApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0 ;

        System.out.println("Παρακαλω εισαγετε ακαιρεους (-1 για εξοδο)");
        //num = scanner.nextInt();

        while ((num = scanner.nextInt()) != -1){
            iterations++;
            System.out.println("Παρακαλω δωστε τον επομενο ακεραιο (-1 για εξοδο)");
            //num = scanner.nextInt();

        }
        System.out.printf("%d επαναληψεις", iterations);
    }
}


