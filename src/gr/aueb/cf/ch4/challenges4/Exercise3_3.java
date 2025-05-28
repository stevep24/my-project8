package gr.aueb.cf.ch4.challenges4;

import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);

        character =Character.toUpperCase(scanner.nextLine().charAt(0));

        boolean isVowel = switch (character){
            case 'Α', 'Ε', 'Η', 'Ι', 'Ο', 'Υ', 'Ω' -> true;
            default -> false;
        };

        System.out.println("Είναι φωνήεν; " + isVowel);

    }
}
