package gr.aueb.cf.challenges;

import java.util.Scanner;

public class AgeDiff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myAge;

        System.out.println("pls insert your age");
        myAge = scanner.nextInt();

        int [] othersYears = {27,15,19,12};
        System.out.println(yearsOld(myAge,othersYears));
    }

    public static int yearsOld(int myYear , int[] othersYears ){
        int max = othersYears[0]; ;
        for (int elements : othersYears){
            if (elements > max){
                max = elements;
            }
        }
        if (myYear >= max){
            return 0;

        }else return max-myYear;

    }
}
