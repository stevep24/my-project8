package gr.aueb.cf.ch2.challenges2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        int day;
        int month;
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls insert number of the day ");
        day = scanner.nextInt();
//        System.out.println("Pls insert number of the month ");
        month = scanner.nextInt();
//        System.out.println("Pls insert number of the year ");
        year = scanner.nextInt();

        System.out.println(day+"/"+month+"/"+year);
    }
}
