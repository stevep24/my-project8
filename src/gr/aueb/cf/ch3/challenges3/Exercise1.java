package gr.aueb.cf.ch3.challenges3;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls insert Year: ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)){
            System.out.println("Το έτος " + year + " είναι δίσεκτο" );
        } else System.out.println("Το έτος " + year + " δεν είναι δίσεκτο");
    }
}
