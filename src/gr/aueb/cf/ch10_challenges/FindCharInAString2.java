package gr.aueb.cf.quiz;

import java.util.Scanner;

public class FindCharInAString2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        String s = "";

        System.out.println("Pls Insert an integer");
        n = scanner.nextInt();
        System.out.println("Pls Insert a String");
        s = scanner.next();

        System.out.println(getCount(n, s , 'a'));

    }

    public static int getCount(int n , String s , char ch) {

        int counter = 0;
        if (n > s.length()) {
            s = getRepeated2(n,s);
        }
        System.out.println(n);
        System.out.println(s);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch)counter++;
        }
        return counter;
    }


    public static String getRepeated2(int n, String s){
        int times;

        times = (int) Math.ceil((double) n / s.length());
        return s.repeat(times);
    }
}
