package gr.aueb.cf.ch4;

/**
 * na emfanisei 10 seires apo asterakia
 * opou sthn 1h seira 1 asteraki
 * sth 2h 2 asterakia klp
 * mexri 10h me 10 asterakia
 */
public class StarsAsc10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int y = 10; y >= i; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
