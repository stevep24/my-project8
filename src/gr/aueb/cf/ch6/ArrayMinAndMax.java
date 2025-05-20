package gr.aueb.cf.ch6;

/**
 * Finds min and max assuming that the
 * first element is the min element and
 * then comparing each array element with min
 * and updating min if a new min is found
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {

        int[] arr = {7,10,3,4,5,9,8,1};
        System.out.println("Min Position: " + getMinPosition(arr));
        System.out.println("Max Position: " + getMaxPosition(arr));
    }

    public static int getMinPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue)
            {   minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getMaxPosition(int[] arr){
        if(arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxValue)
            {   maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
