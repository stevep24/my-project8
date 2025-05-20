package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Ο χρήστης δίνει ένα ακέραιο από 1 - 10
 * και υπολογίζεται ως output ο πολλαπλασιασμός
 * του ακεραίου με όλους τους ακέραιους από 1-10.
 * Για παράδειγμα: αν ο χρήστης δώσει το 5 τότε ως
 * output αναμένουμε να πάρουμε:
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 5 * 3 = 15
 * ...
 * ...
 * 5 * 10 = 50
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        int inputInt;
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Παρακαλω εισαγετε εναν ακεραιο αριθμο: ");
        inputInt = input.nextInt();

        while(i <= 10){
            System.out.printf("%d * %d = %d\n ",inputInt,i,inputInt * i);
            i++;

        }
    }
}
