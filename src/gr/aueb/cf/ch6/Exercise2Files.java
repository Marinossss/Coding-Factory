package gr.aueb.cf.ch6;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Exercise2Files {

    public static void main(String[] args) {
        String path = "C:/tmp/";
        int totalBytesWritten = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Εισαγέται το ονομα του αρχειου: ");

        String fileName = in.nextLine();


        File inFile = new File(path + fileName);

        if (!inFile.exists()) {
            System.out.println("Το αρχείο δεν υπάρχει " + inFile.getAbsolutePath());
            return;
        }

        File outFile = new File(path + UUID.randomUUID().toString().replace(":", "_")  + "_" + fileName);

        System.out.println("Το αρχίκο αρχείο " + inFile.getAbsolutePath());
        System.out.println("Το νέο αρχείο " + outFile.getAbsolutePath());

        try (InputStream inputStream = new FileInputStream(inFile);
             OutputStream outputStream = new FileOutputStream(outFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesWritten += bytesRead;
            }

            System.out.println("Η εγγραφή ολοκληρώθηκε!");
            System.out.println("Συνολικός αρίθμος bytes που γράφτηκαν: " + totalBytesWritten);

        } catch (IOException e) {
            e.printStackTrace();

        }  finally {
            in.close();
        }

    }


}
