package gr.aueb.cf.ch1;

/**
 * προσθετει δυο ακεραιους και εμφανιζει το
 * αποτελεσμα στην κονσολα.
 */
public class AddApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.println("Το αποτέλεσμα των: " + num1 + " και " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το αποτέλεσμα των: %d και %d ειναι ισο με: %d", num1, num2, result);
    }
}
