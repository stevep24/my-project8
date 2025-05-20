package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ypologismoa athroismatos 2 integer me thn xrhsh methodwn
 */
public class AddSubWithMethodsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Please insert two integers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum=add(num1,num2);  //invoke - call the add method
        int sub = sub(num2,num1);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
    }

    /**
     * adds two integers
     * @param a the first integer
     * @param b the second integer to add.
     * @return the sum of a and b
     */
    public static int add(int a, int b){
        return a + b;
    }


    /**
     * substracts two integers
     * @param a the first integer to subtract from.
     * @param b the second integer that is subtracted
     * @return the subtraction of a - b
     */
    public static int sub(int a, int b){
        return a - b;
    }

//    public static int add(int a, int b){
//        int sum = 0 ;
//        sum = a + b;
//        return sum;
//    }

}
