package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Input / Output in Strings
 */
public class StringIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Παρακαλω εισαγετε δυο αλφαριθμητικα");

        s1 = scanner.next(); // Διαβάζει μέχρι να βρεί  whitespace (spaces,tav,new line)
        s2 = scanner.nextLine(); // Διαβάζει μέχρι να βρει new line

        System.out.printf("s1 = %s\n", s1);
        System.out.printf("s1 = %s\n", s2);

    }
}
