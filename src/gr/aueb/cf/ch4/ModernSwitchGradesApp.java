package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *  o xrhsths eisagei enan arithmo apo 1-10
 *  kai to programma emfanizei katallhlo minima.
 *  opws arista (9,10), poli kala(7,8) kalos(5-6)
 *  kai apotuxia (1-6).
 *
 *  Xrhsh modern Switch
 */
public class ModernSwitchGradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;


        System.out.println("parakalw eisagete enan arithmo ");
        grade =scanner.nextInt();

        switch (grade){
            case 1,2,3,4 -> System.out.println("apotuxia");
            case 5,6 -> System.out.println("kala");
            case 7,8 -> System.out.println("Polu Kala");
            case 9,10 -> System.out.println("Arista");
            default -> System.out.println("Lathos Arithmos");
        }
    }
}
