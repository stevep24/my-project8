package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringTrim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;

        System.out.println("Pls insert your name");
        firstName = scanner.nextLine().trim();
        System.out.println(firstName);
    }
}
