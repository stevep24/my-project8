package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * O xrhsths tha dwsei aritmiti kai paranomasti
 * kai to programma tha prepei na elenxei an o paranomastis
 * einai 0 ,
 * giati den mporei na ginei diairesi me to 0.
 */
public class DivisionApp {

    public static void main(String[] args) {
        int numerator = 0 ;
        int denominator = 0;
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true){
            System.out.println("Parakalw eisagete ton arithmiti");
            numerator = scanner.nextInt();

            System.out.println("Parakalw eisagete ton paranomasti");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("o Paranomastis den mporei na einai 0");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);

        }

    }
}
