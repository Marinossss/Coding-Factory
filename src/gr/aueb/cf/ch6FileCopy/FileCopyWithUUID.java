package gr.aueb.cf.ch6FileCopy;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class FileCopyWithUUID {

    public static void main(String[] args) {
        String directoryPath = "C:/tmp/";
        int totalBytesCopied = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();

        File sourceFile = new File(directoryPath + fileName);

        if (!sourceFile.exists()) {
            System.out.println("File does not exist: " + sourceFile.getAbsolutePath());
            return;
        }

        File destinationFile = new File(directoryPath + UUID.randomUUID().toString().replace(":", "_") + "_" + fileName);

        System.out.println("Original file: " + sourceFile.getAbsolutePath());
        System.out.println("New file: " + destinationFile.getAbsolutePath());

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("File copy completed!");
            System.out.println("Total bytes copied: " + totalBytesCopied);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            scanner.close();
        }
    }
}
