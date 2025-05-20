package gr.aueb.cf.ch7;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * from string to primitive data types.
 * from primitives data types to String.
 */
public class StringTypecast {

    public static void main(String[] args) {

        double myDouble =3.5;
        BigInteger bigInt = new BigInteger("123456789");
        String strDouble = String.valueOf(myDouble);
        String strInt = bigInt.toString();


    }
}
