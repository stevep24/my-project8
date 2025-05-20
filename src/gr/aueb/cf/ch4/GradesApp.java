package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o xrhsths eisagei enan arithmo apo 1-10
 * kai to programma emfanizei katallhlo minima.
 * opws arista (9,10), poli kala(7,8) kalos(5-6)
 * kai apotuxia (1-6).
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("parakalw eisagete enan arithmo ");
        grade =scanner.nextInt();
        switch (grade){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("apotuxia");
//                break;
            case 1,2,3,4:System.out.println("apotuxia");
                break;
            case 5:
            case 6:
                System.out.println("kala");
                break;
            case 7:
            case 8:
                System.out.println("Poli kala");
                break;
            case 9:
            case 10:
                System.out.println("Arista");
                break;
            default:
                System.out.println("parakalw dwste ena arithmo apo to 1-10");
        }
    }
}
