package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβαζει για παντα και οταν βρει τον 'sentinel' διακοπτει το loop
 * η διακοπη και εξοδος απο μια επαναληπτικη δομη γινεται με break.
 */
public class SentinelApp3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0 ;
        int iterations = 0;
        while (true){
            System.out.println("Παρακαλω εισαηετε εναν ακεραιο (-1 για εξοδο)");
            num = scanner.nextInt();
            iterations++;
            if (num == -1){
                break;
            }
        }
        System.out.println("Το πληθος ειναι ισο με:" + iterations);
    }
}
