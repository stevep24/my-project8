package gr.aueb.cf.ch4.challenges4;

import java.util.Scanner;

public class Exercise3_1 {

    public static void main(String[] args) {

        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Διαλέξτε μια μέρα μεταξύ 1-7:");
        day = scanner.nextInt();

         switch (day){
             case 1 -> System.out.println("Δευτέρα");
             case 2 -> System.out.println("Τρίτη");
             case 3 -> System.out.println("Τετάρτη");
             case 4 -> System.out.println("Πέμπτη");
             case 5 -> System.out.println("Παρασκευή");
             case 6 -> System.out.println("Σάββατο");
             case 7 -> System.out.println("Κυριακή");
             default -> System.out.println("Διάλεξε μεταξύ 1-7");
         }

    }
}
