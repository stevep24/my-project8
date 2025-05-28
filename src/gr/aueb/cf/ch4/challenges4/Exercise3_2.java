package gr.aueb.cf.ch4.challenges4;

import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        char calculatorSymbol;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 2 ακέραιους αριθμούς");
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Παρακαλώ εισάγετε 1 σύμβολο απο τα εξης 4: (+, -, *, /)");
        calculatorSymbol = scanner.nextLine().charAt(0);

        switch (calculatorSymbol){

            case '+' -> System.out.println("Αποτέλεσμα πρόσθεσης:" + (numberOne+numberTwo));
            case '-' -> System.out.println("Αποτέλεσμα αφαίρεσης:" + (numberOne-numberTwo));
            case '*' -> System.out.println("Αποτέλεσμα πολλαπλασιασμού:" + (numberOne*numberTwo));
            case '/' -> System.out.println("Αποτέλεσμα διαίρεσης:" + (numberOne/(double)numberTwo));
            default ->  System.out.println("Λάθος πράξη. Παρακαλώ εισάγετε 1 σύμβολο απο τα εξης 4: (+, -, *, /)");
        }


    }
}
