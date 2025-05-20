package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * O xrhsths eisagei ena akaireio kai prospathei na mantecei enan secret number.
 * an to kataferei tote kanei bingo!
 */
public class SecretIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputnum;

        System.out.println("Parakalw eisagete to mystiko kleidi");
        inputnum = scanner.nextInt();

        if (inputnum == SECRET){
            System.out.println("Bingo!");
        }
    }
}
