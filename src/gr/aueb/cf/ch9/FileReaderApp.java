package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileReaderApp {

    public static void main(String[] args) {


    }

    /**
     * Reads the contents of a file character by character and prints them to the standard output.
     * If an I/O error occurs, it logs the error with a timestamp.
     *
     * @param file the path of the file to be read
     */
    public static void fileReaderRead(String file) throws IOException {
        try(FileReader fr = new FileReader(file)){
            int ch;

            while ((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }
        }catch (IOException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Reads the contents of a file line by line using a Scanner and prints each line
     * to the standard output. The file is read using UTF-8 encoding. If an I/O error
     * occurs, it logs the error with a timestamp.
     *
     * @param file the file to be read
     */
    public static void scannerRead(File file) throws IOException {
        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)){
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     * Reads the contents of a file line by line using a BufferedReader and prints each line
     * to the standard output. If an I/O error occurs, it logs the error with a timestamp.
     *
     * @param file the file to be read
     * @throws IOException if an I/O error occurs during file reading
     */
    public static void bufferedRead(File file) throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
