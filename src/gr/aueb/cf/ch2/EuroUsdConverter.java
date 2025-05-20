package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβαζει απο τον χρηστη ενα ποσο
 * σε ευρω και μετατρεπει σε USD και cents.
 * Η ισοτημια ειναι 99 USD cents = 1 Euro
 */
public class EuroUsdConverter {
    public static void main(String[] args) {

        int inputEuros = 0;
        int totalUsdCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Παρακαλώ εισαγετε ενα ποσο σε Euro (ακαιρεο): ");
        inputEuros = in.nextInt();
        totalUsdCents = inputEuros * PARITY;
        usaDollars = totalUsdCents / 100;
        usaCents = totalUsdCents % 100;

        System.out.printf("%d \u20AC = %d \u0024, %d usa cents", inputEuros, usaDollars , usaCents);
    }
}
