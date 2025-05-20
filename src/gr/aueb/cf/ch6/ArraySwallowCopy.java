package gr.aueb.cf.ch6;

/**
 * όταν κάνουμε copy references, τότε το copy
 * ονόμαζεται swallow και εχει side effects
 */
public class ArraySwallowCopy {

    public static void main(String[] args) {
        int[] initialArray = {1,2,3,4,5};
        int[] copyArray = initialArray; // Αντιγραφή των δεικτών

        copyArray[0] = 1000;
        System.out.println(initialArray[0]);


    }
}
