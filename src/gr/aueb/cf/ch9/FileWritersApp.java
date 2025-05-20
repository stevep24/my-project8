package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * The FileWritersApp class demonstrates the usage of file writing mechanisms in Java
 * using FileWriter and BufferedWriter. It provides methods to write data to a file
 * and handles potential input/output exceptions during the process.
 */
public class FileWritersApp {

    public static void main(String[] args) {
        File fd = new File("C://Users//STEVE//Desktop//CODING FACTORY//RoutProjectsFolder/file-writer.txt");
        try {
            //fileWriter(fd);
            bufferedWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο σφάλμα συνεβή");
        }

        try(PrintStream ps = new PrintStream("C://Users//STEVE//Desktop//CODING FACTORY//RoutProjectsFolder/file.txt" , StandardCharsets.UTF_8)) {
            sayHello(ps);
            sayHello(System.out);
        }catch (IOException e){
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο σφάλμα συνεβή");

        }




    }

    public static  void fileWriter(File file) throws IOException{
        try(FileWriter fw = new FileWriter(file, true)){   //Try with recourses, rue = append
            fw.write("Coding!");
            fw.flush();
        }catch (IOException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.write("Factory");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + " " + e);
            throw e;
        }
    }

    public static void printStream(String file) throws IOException{
//        try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8))
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)){

            ps.println("Printimg with print stream");
            ps.flush();
        } catch (IOException e){
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }


    /**
     * Writes a predefined message to a file using a PrintWriter. The message
     * will be appended to the file if it already exists, and the file is
     * encoded in UTF-8.
     *
     * @param file the path of the file to which the message will be written
     * @throws IOException if an I/O error occurs during file writing
     */

    public static void printWriter(String file) throws IOException{
//        try (PrintWriter ps = new PrintWriter(file, StandardCharsets.UTF_8))
        try (PrintWriter ps = new PrintWriter(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)){

            ps.println("Printing with print stream");
            ps.flush();
        } catch (IOException e){
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }


    /**
     * Prints a "Hello CF8!" message to the given PrintStream.
     *
     * @param ps the PrintStream to which the message will be printed
     */
    public static void sayHello(PrintStream ps){
        ps.println("Hello CF8!");
    }
}
