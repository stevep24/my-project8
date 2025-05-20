package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * ο χρηστης δινει την ηλικια του σε ετη(εστω ακεραιος)
 * και το προγραμμα  δινει την ηλικια σε ημερες, οπου
 * θεωρουμε οτι ενα ετος  = 365 μερες. Για παραδειγμα αν δοθει η ηλικια 20 ετων,
 * το αποτελεσμα ειναι 7300 μερες.
 */
public class YearsToDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_PER_YEAR = 365;


        System.out.println("Παρακαλω εισαγετε την ηλικια σας σε Χρονια: ");
        inputAgeInYears = input.nextInt();
        ageInDays = inputAgeInYears * DAYS_PER_YEAR;

        System.out.printf("Τα %d χρόνια είναι ίσο με %d μέρες", inputAgeInYears, ageInDays);


    }
}
