package gr.aueb.cf.ch7;

/**
 * Ελέχγει αν ενα string είναι παλινδρομικό.
 * Για παράδειγμα, το "Atta" είναι παλινδρομικό.
 * Hint. O stringBuilder παρέχει την sb.reverse().
 * Hint. O stringBuilder παρέχει την sb.toString().
 */
public class StrPalindrome {

    public static void main(String[] args) {
        String s = "AttA";
        System.out.println(Palindrome(s));

    }

    public static boolean Palindrome (String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);

    }
}
