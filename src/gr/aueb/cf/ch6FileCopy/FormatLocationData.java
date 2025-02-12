package gr.aueb.cf.ch6FileCopy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class FormatLocationData {

    public static void main(String[] args) {
        String inputFile = "C:/tmp/location.txt";
        String outputFile = "C:/tmp/location-formatted.txt";
        String line;
        String[] dataFields;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintStream printStream = new PrintStream(outputFile, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                dataFields = line.split(",+\s*");
                printFormatted(printStream, dataFields);
                printFormatted(System.out, dataFields);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void printFormatted(PrintStream printStream, String[] dataFields) {
        printStream.printf("{ \"Location\": \"%s\", \"Latitude\": \"%s\", \"Longitude\": \"%s\" }, \n",
                dataFields[0], dataFields[1], dataFields[2]);
    }
}