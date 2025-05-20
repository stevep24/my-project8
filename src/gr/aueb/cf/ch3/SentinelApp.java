package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0 ;

        System.out.println("Παρακαλω εισαγετε ακαιρεους (-1 για εξοδο)");
        num = scanner.nextInt();

        while ( num != -1){
            iterations++;
            System.out.println("Παρακαλω δωστε τον επομενο ακεραιο (-1 για εξοδο)");
            num = scanner.nextInt();

        }
        System.out.printf("%d επαναληψεις", iterations);
    }
}
