package gr.aueb.cf.ch6;

/**
 * founds the min  or the max of a table
 * assuming that the first min is the MAXINT
 * (integer.MAX_VALUE) and  the same for the max,
 * the first max is thw MIN integer value
 */
public class ArrayMinMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPostion(int[] arr){

        if (arr == null || arr.length < 1) return -1;
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getManPostion(int[] arr){

        if (arr == null || arr.length < 1) return -1;
        int maxValue = Integer.MIN_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
