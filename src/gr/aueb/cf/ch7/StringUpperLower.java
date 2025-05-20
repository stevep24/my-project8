package gr.aueb.cf.ch7;

public class StringUpperLower {

    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = "ATHENS";

        String Upper = str1.toUpperCase();
        String lower = str2.toLowerCase();

        //Αν δεν είχαμε την equalsIgnoreCase() πως θα συγκρίναμε;
        //case-insensitive
        //Normalization των Strings σε κεφαλαία και σύγκριση

        boolean areEqual = str1.toUpperCase().equals(str2.toUpperCase());

    }
}
