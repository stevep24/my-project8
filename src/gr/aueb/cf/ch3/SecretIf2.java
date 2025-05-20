package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Elegei olesa tiw periptoseis me if-else-the
 */
public class SecretIf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputnum;

        System.out.println("Parakalw eisagete to mystiko kleidi");
        inputnum = scanner.nextInt();

        if (inputnum == SECRET){
            System.out.println("Success!");
        } else {
            System.out.println("Fail. Try again!");
        }
    }
}
