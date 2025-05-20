package gr.aueb.cf.ch6;

/**
 * Διασχίζει έναν πίνακα, δλδ επισκέπτεται μία-μία τις θέσεις
 * του πίνακα και εκτυπώνει την τιμή της κάθε θέσης
 */
public class ArrayTraverse {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] grades = {10,8,5,7,9};
        int[] arr3 = new int[]{1,2,3,4,5};

        //traverse with for
        for( int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.println();

        //Enhanced For
        for (int grade : grades) System.out.print(grade + " ");


    }
}
