package gr.aueb.cf.ch6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Exercise1Files {

    public static void main(String[] args) {
        String inFile = "C:/tmp/location.txt";
        String outFile = "C:/tmp/location-formated.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
             PrintStream ps = new PrintStream(outFile, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
                printFormated(ps, tokens);
                printFormated(System.out, tokens);



            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void printFormated(PrintStream ps, String[] tokens) {



        ps.printf("{ \"Location\": \"%s\", \"Latitude\": \"%s\", \"Longitude\": \"%s\"}, \n", tokens[0], tokens[1], tokens[2]);
    }
}
