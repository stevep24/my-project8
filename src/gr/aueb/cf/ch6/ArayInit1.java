package gr.aueb.cf.ch6;

public class ArayInit1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("first elemeent:"  + arr[0]);
        System.out.println("array length: "+ arr.length);
        System.out.println("last element: " + arr[arr.length - 1]);

    }
}
