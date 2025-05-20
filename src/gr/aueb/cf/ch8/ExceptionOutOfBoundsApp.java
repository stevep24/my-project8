package gr.aueb.cf.ch8;

/**
 * the runtimr exception who made by programing mistakes
 * we dont used try-catch
 */
public class ExceptionOutOfBoundsApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        //Το = έχει ως αποτέλεσμα το  array index out of bounds exception
        for (int i = 0; i <= arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
