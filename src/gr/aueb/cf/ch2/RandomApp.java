package gr.aueb.cf.ch2;

/**
 * Προσομειωνει ενα τυχαιο ζαρι. Δηλαδη παραγει ενα τυχαιο
 * ακεραιο μεταξυ 1-6.
 */
public class RandomApp {
    public static void main(String[] args) {
        int die = 0 ;
        // (max - min + 1) + min
        die =(int) (Math.random() * 6) + 1;

        System.out.println(die);
    }
}
