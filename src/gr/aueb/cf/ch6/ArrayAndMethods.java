package gr.aueb.cf.ch6;

/**
 * Demo with arrays and methods.
 * Πως περνάμε πίνακες ως παραμέτρους
 * μεθόδους.
 */
public class ArrayAndMethods {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        printArray(arr, 0, arr.length);

    }

    /**
     * prints the elements of an array.
     *
     * @param arr
     */
    public static void printArray(int[] arr){
        arr[0] = 1000; //Οποιαδήποτε αλλαγή στις τιμές του array διατηρείται.
        for (int item : arr){
            System.out.println(item + " ");
        }
    }

    /**
     *Overloaded version of for with boundaries.
     * Print an array slice from 'low' to 'high',
     * that is from low till high - 1. High is not
     * inclusive. Checks for edge cases: low < 0
     * and high > length - 1.
     * @param arr
     * @param low
     * @param high
     */
    public static  void printArray(int[] arr, int low, int high){
        if ( low < 0 || high > arr.length || low > high ) {
            return;
            //System.out.println("Out of range");
        }

            for ( int i = low; i < high; i++){
                System.out.println(arr[i] + " ");
            }

    }
}

