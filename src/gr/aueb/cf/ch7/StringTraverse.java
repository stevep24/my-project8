package gr.aueb.cf.ch7;

/**
 * Traverse a String one by one all char.
 * but no with enhanced for,but with classic
 */
public class StringTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        for ( int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
