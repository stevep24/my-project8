package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerAppFor {

    public static void main(String[] args) {
        // BigInteger bigInteger = new BigInteger("1");
        BigInteger bigResult = new BigInteger("1");
        int base;
        int power;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parakalw eisagete enan akeraio gia base:");
        base = scanner.nextInt();
        System.out.println("Parakalw eisagete enan akeraio gia power:");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++)
        {
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }
        System.out.printf("Result = %d\n",result);
        System.out.println("Big result = " + bigResult);
    }

}
