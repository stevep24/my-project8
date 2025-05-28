package gr.aueb.cf.quiz;

public class FindCharInString {

    public static void main(String[] args) {

        System.out.println(getCount(5, "dawasc" , 'a'));

    }

    public static int getCount(int n , String s , char ch) {

        int counter = 0;
        if (n > s.length()) return 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch)counter++;
        }
        return counter;
    }
}
