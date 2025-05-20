package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)){
                System.out.println("Λάθος επιλογή. Η επιλογή πρέπει να είναι μεταξύ 1-6, προσπάθησε ξανά");
                continue;
            }

            if(isChoiceExit(choice)){
                System.out.println("Έξοδος");
                break;
            }



        }

    }
    public static void printMenu(){
        System.out.println("Παρακαλώ διαλέξτε μεταξύ των παρακάτω επιλογών");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμό");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Έξοδος");
    }

    public static int getOneInt(){
//        int choice = scanner.nextInt();
//        return choice;
        return scanner.nextInt();


    }

    public static boolean isChoiceValid(int choice){
        if ( choice > 5 || choice < 1){
            return false;
        } else {
            return true;
        }
    }

    public static boolean isChoiceExit(int choice){
        if (choice == 6){
            return true;
        }else {
            return false;
        }
    }

//    public static int getResultBasedonChoice(int choice){
//        int num1;
//        int num2;
//
//        num1=getOneInt();
//        num2=getOneInt();
//
//        return switch (choice){
//            case 1-> num1 + num2;
//            case 2 ->
//            case 3 ->
//            case 4 ->
//            case 5 ->
//        };
//    }
}
