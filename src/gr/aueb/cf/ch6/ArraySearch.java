package gr.aueb.cf.ch6;

/**
 * Αναζητά ενα στοιχείο σε εναν πίνακα
 * και επιστρέφει τη θέση του στοιχείου στον πίνακα
 * ή -1 αν δεν υπάρχει.
 */
public class ArraySearch {

    public static void main(String[] args) {

    }

    public static int getPosition(int[] arr, int value){
        int positionToReturn = -1;
        for ( int i = 0; i < arr.length; i++ ){
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }


}
