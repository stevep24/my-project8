package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρεπει μιλια σε χιλιομετρα
 * ενα μιλι = 1,6 χιλιομετρα. Αρα, για παραδειγμα,
 * 10 μιλια =16 χιλιομετρα.
 * Ο χρηστης δινει την τιμη σε μιλια.
 */
public class MilesToKm {
    public static void main(String[] args) {

        //Δηλωση Μεταβλητων και Αρχικοποιηση
        Scanner input = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometers = 0.0;
        final double KM_PER_MILE = 1.6;

        //εντολες
        System.out.println("Παρακαλώ εισάγετε μίλια:");
        inputMiles = input.nextDouble();
        kilometers= inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", Km: " + kilometers);




    }
}
