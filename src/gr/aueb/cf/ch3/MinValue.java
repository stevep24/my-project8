package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Briskei thn mikroteri timh metaxi duo akeraiwn
 */
public class MinValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int min;

        System.out.println("Parakalw eisagete 2 akeraious");
        num1 =scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2){
//            min = num1;
//        } else {
//            min = num2;
//        }
//          =================
        min = (num1 < num2) ? num1 : num2;
        System.out.printf("Min = %d", min);
    }
}
