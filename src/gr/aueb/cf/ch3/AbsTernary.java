package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * briskei to apoluto 2 akeraiwn me thn xrhsh triadikou telesti,
 * to apolito einai panta thetikos
 * gia paradeigma :
 * to apoluto tou -5 einai 5
 * to apoluto tou 5 einai 5
 */
public class AbsTernary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int abs;

        System.out.println("Parakalw eisagete 2 akeraious");
        num1 =scanner.nextInt();
        num2 = scanner.nextInt();


        abs = (num1 < 0) ? (-num1) : num1;
    }
}
