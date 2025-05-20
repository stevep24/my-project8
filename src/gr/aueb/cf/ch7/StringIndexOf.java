package gr.aueb.cf.ch7;

/**
 * finds the position inside a string for one character or substring
 */
public class StringIndexOf {

    public static void main(String[] args) {

        String cf ="Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o", 2); //11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o"); //11
        System.out.println(positionOfLasto);


    }
}
