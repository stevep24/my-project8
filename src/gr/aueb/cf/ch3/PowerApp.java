package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη 2 ακεραίους
 * έστω base και power και υπολογίζει με επαναληπτικό τρόπο (while - do)
 * τη δύναμη base^power και εκτυπώνει το αποτέλεσμα στο stdout.
 * Για παράδειγμα, αν ο χρήστης δώσει base = 2 και power=10, τότε το base^power =1024
 * δηλαδή 2*2*...*2, 10 φόρες που ισούται με 1024
 */
public class PowerApp {

    public static void main(String[] args) {
        int base;
        int power;
        int result = 1;
        int i= 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την βάση : ");
        base = scanner.nextInt();
        System.out.println("Παρακαλώ εισάγετε την Δύναμη : ");
        power = scanner.nextInt();

        while (i <= power){
            result *= base ;
            i++;
        }
        System.out.println("Το αποτέλεσμα του base^power= " + result);
    }
}
