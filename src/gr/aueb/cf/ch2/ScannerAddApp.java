package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * διαβαζει δυο ακεραιους  απο το
 * stdin (keyboard) kai ypologizei to apotelesma
 */
public class ScannerAddApp {

    public static void main(String[] args) {

        //δηλωση και αρχικοποιηση μεταβλητων
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1 + num2;

        //Εκτυπωση Αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1 , num2 , sum);



    }
}
