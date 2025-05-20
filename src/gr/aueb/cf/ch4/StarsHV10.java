package gr.aueb.cf.ch4;

/**
 * Ektupwnei 10 grammes me 10 asterakia
 * se kathe grammh
 */
public class StarsHV10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
