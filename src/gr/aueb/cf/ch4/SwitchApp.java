package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * H switch case xrisimopoieite anti twn pollaplwn if-then-else.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;

        System.out.println("Eisagete ena apo ta paraktw");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team game");
        System.out.println("4. Exit");

        choise = scanner.nextInt();

        switch (choise){
            case 1:
                System.out.println("one-player game started");
                break;
            case 2:
                System.out.println("two-player game started");
                break;
            case 3:
                System.out.println("Team player game started");
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong choise");
                break;
        }
    }
}
