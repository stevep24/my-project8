package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψηφιο ακέραιο και το Πρόγραμμα
 * υπολογίζει το άθροισμα των ψηφίων του ακεραιου.
 * Για παραδειγμα αν ο χρηστης δωσει το 12, τοτε
 * το αθροισμα των ψηφιων ειναι 1 + 2 = 3
 */
public class DigitsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;
        int inputNum = 0;

        System.out.println("Παρακαλω εισαγετε ενα διψηφιο ακέραιο : ");
        inputNum = input.nextInt();

        leftDigit = inputNum/10;
        rightDigit = inputNum % 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Input number: %d, Left Digit: %d , Right Digit = %d, Sum = %d",
                inputNum,leftDigit,rightDigit,sumOfDigits);
    }
}
