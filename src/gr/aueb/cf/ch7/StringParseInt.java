package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringParseInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Pls insert one integer");
        s = scanner.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
