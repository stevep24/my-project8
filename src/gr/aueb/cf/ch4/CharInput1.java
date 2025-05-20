package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * chat input as byte (Latin)
 */
public class CharInput1 {
    public static void main(String[] args) throws IOException {

        int inputChar = ' ';

        System.out.println("parakalw eisagete ena xaraktira");
        inputChar = System.in.read();

        System.out.println("Char: " + (char) inputChar);
    }
}
