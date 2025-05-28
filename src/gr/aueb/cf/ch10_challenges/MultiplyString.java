package gr.aueb.cf.ch10_challenges;

public class MultiplyString {

    public static void main(String[] args) {
        String s= "aka";
        System.out.println(getRepeated1(5,s));
        System.out.println(getRepeated2(4,s));

    }

    public static String getRepeated1(int times, String characters){
        return characters.repeat(times);
    }
    public static String getRepeated2(int n, String characters){
        int times;

        times = (int) Math.ceil((double) n / characters.length());
        return characters.repeat(times);
    }
}
