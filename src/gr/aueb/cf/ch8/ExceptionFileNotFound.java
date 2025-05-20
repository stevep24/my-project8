package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExceptionFileNotFound {

//    public static void main(String[] args) {
//        String numStr = "";
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File("text.txt"));
//            while (!isInteger(numStr = scanner.nextLine())){
//                System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί.Παρακαλώ δώστε νέο ακέραιο");
//
//            }
//
//        } catch (FileNotFoundException e){
//            System.err.println(LocalDateTime.now() + "\n" + e); // logging
//        } finally {
//            try{
//            if (scanner != null) scanner.close();
//            } catch (Exception e){
//                System.out.println(LocalDateTime.now() + "\n" + e);
//            }
//        }
//
//    }

    //try with resources
    public static void main(String[] args) {
        String numStr = "";

        try (Scanner scanner = new Scanner(new File("text.txt"))){

            while (!isInteger(numStr = scanner.nextLine())){
                System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί.Παρακαλώ δώστε νέο ακέραιο");
            }
            System.out.println(numStr);
        }catch (FileNotFoundException e){
            System.out.println(LocalDateTime.now() + "\n" + e);
        }


    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
