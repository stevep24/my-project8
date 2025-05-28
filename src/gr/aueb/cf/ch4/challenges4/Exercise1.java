package gr.aueb.cf.ch4.challenges4;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int multiply;
        System.out.println("Παρακαλώ δώστε το πλήθος των \"*\"");
        multiply = scanner.nextInt();

        //1.1
        for (int i = 0; i < multiply; i++){
            System.out.print("*");
        }
        System.out.println();
        //1.2
        for (int i = 0; i < multiply; i++){
            System.out.println("*");
        }
        System.out.println();
        //1.3
        for (int i = 0; i < multiply; i++){
            for (int y = 0; y < multiply; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //1.4
         for (int i = 0; i <= multiply; i++){
             for (int y = 0; y < i; y++){
                        System.out.print("*");
             }
             System.out.println();
         }
         System.out.println();
         //1.5
        for (int i = 0; i < multiply; i++){
            for (int y = multiply; y > i; y--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
