package gr.aueb.cf.ch7;

/**
 * we want to split one String to subStrings bases on one delimiter.
 */
public class StringSplit {

    public static void main(String[] args) {
        String s = "Athens:Uni:of:econ:And:Business";

        String[] tokens = s.split(":");
        for (String token : tokens){
            System.out.print(token + " ");
        }

    }
}
