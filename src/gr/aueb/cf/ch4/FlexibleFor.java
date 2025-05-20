package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FlexibleFor {

    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int step = 0;
        int iterration = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parakalw eisagete start, end kai step");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        for( int i = start; i <= end; i+=step){
            iterration++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterrations = "+ iterration);

    }
}
