package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n, οπου n
 * ειναι ενας ακεραιος που δινει ο χρηστης
 * Το παραγοντικό του n συμβολιζεται ως n! και
 * ισούται με 1 * 2 * 3 * ... * n. Για παράδειγμα
 * το 3! = 1 * 2 * 3, το 0! = 1, κλπ.
 */
public class Factorial {

    public static void main(String[] args) {

        int n ;
        int result = 1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer, please : ");
        n = scanner.nextInt();

        while (i <= n){
            result *= i;
            i++;
        }

        System.out.printf("%d! = %d",n,result);
    }
}
