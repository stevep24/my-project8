package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει μια τιμη και το
 * προγραμμα υπολογιζει την τιμη με το ΦΠΑ
 * ΑΝ το ΦΠΑ ειναι 24%(0,24) και ο χρηστης δωσει την τιμη 100
 * το αποτελεμα θα ειναι 124
 */
public class PriceWithVat {

    public static void main(String[] args) {

        //Αρχικοποιηση και Δηλωση Μεταβλητων
        Scanner input = new Scanner(System.in);
        double inputPrice = 0.0;
        double computedVat = 0.0;
        double priceWithVat = 0.0;
        final double VAT_RATE = 0.24;

        System.out.println("Παρακαλω εισαγετε τιμη: ");
        inputPrice = input.nextDouble();
        computedVat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + computedVat;


        System.out.printf("Price: %.2f, Vat: %.2f, Price with Vat: %.2f", inputPrice,computedVat,priceWithVat );


    }
}
