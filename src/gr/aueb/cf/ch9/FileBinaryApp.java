package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.UUID;

public class FileBinaryApp {

    public static void main(String[] args) {

        String inputFile = "C://Users//STEVE//Desktop//ΑΜΕΑ//application.pdf";
        String outputFile = "C://Users//STEVE//Desktop//ΑΜΕΑ//application_out.pdf";

        try {
            binaryInputReadWrite(inputFile,outputFile);
        }catch (IOException e){
            System.out.println("Η αντιγραφη του αρχειου απετυχε.");
        }


    }

    /**
     * Copies the content of a binary file from the specified input file to the specified output file
     * using a 4KB buffer for efficient file reading and writing. If an I/O error occurs during the
     * process, it logs the error with a timestamp and rethrows the exception.
     *
     * @param inputFile the path of the file to be read
     * @param outputFile the path of the file to be written
     * @throws IOException if an I/O error occurs during file reading or writing
     */
    public static void binaryInputReadWrite(String inputFile, String outputFile) throws IOException {

        final int BUFFER_SIZE = 4096; // 4KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        long start;
        long end;
        double elapsedTime;
        int counter = 0;

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)){

            start = System.currentTimeMillis();
            while ((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0 , bytesRead);
                counter += bytesRead;

            }

            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("Το αρχείο με μέγεθος %.2f (%d byte) αντιγράφηκε επιτυχώς", (counter / 1024.0) , counter);
            System.out.println(" Elapsed time: " + elapsedTime + " sec" + "\n");

            File inFd = new  File(inputFile);
            File outFd = new  File(outputFile);
            System.out.println("Input File absolute path + " + inFd.getAbsolutePath());
            System.out.println("Output File absolute path + " + outFd.getAbsolutePath());

            //hint for random output paths
            String outputRandomPath = outputFile + UUID.randomUUID().toString().replaceAll("-","");
            File randomFile = new File(outputRandomPath);
            FileOutputStream bos2 = new FileOutputStream(randomFile);
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;

        }
    }

    /**
     * Copies the content of a binary file from the specified input file to the specified
     * output file using buffered input and output streams. Utilizes an 8KB buffer
     * for efficient file reading and writing. If an I/O error occurs during the process,
     * it logs the error with a timestamp and rethrows the exception.
     *
     * @param inputFile the path of the file to be read
     * @param outputFile the path of the file to be written
     * @throws IOException if an I/O error occurs during file reading or writing
     */
    public static void binaryBufferedInputReadWrite(String inputFile, String outputFile) throws IOException {

        final int BUFFER_SIZE = 8192; // 8KB buffer
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(inputFile), BUFFER_SIZE);
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(outputFile), BUFFER_SIZE)){

            while ((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0 , bytesRead);

            }

        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;

        }
    }
}
