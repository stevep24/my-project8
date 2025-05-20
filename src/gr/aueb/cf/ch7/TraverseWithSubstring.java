package gr.aueb.cf.ch7;

/**
 * Print char-by-char with the {@link String#substring(int)}.
 */
public class TraverseWithSubstring {

    public static void main(String[] args) {
        String s = "Coding";
        traverse(s);
    }

    public static  void traverse(String s){
        for (int i = 0; i < s.length(); i++)
            System.out.print(s.substring(i, i+1) + " ");
    }
}
