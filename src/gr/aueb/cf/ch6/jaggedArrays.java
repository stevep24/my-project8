package gr.aueb.cf.ch6;

/**
 * jagged arrays is two-dimensions tables with
 * different size for every line
 */
public class jaggedArrays {

    public static void main(String[] args) {
        int[][] arr = new int[3][];


        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];

        //traverse
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int[] row : arr){
            for ( int line : row){
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}
