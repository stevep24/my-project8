package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Diavazei char me Scanner.
 */
public class ChatInput2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        System.out.println("parakalw dwste ena xaraktira");
        inputChar = scanner.nextLine().charAt(0);
        System.out.println("Input char: " + inputChar);
    }
}
