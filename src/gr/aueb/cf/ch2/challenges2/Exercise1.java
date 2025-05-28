package gr.aueb.cf.ch2.challenges2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        double celsTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls insert an integer as Fahrenheit temperature ");

        int fahrTemp = scanner.nextInt();
        celsTemp = ((5.0/9)*(fahrTemp-32));

        System.out.printf("Οι βαθμοί Fahrenheit είναι %.2f Celsius ", celsTemp);

    }
}
