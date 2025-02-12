package gr.aueb.cf.Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CharacterStats {


    public static void main(String[] args) {
        String filePath = "C:/tmp/chars.txt";
        char[] chars = readFile(filePath);


        countFrequencies(chars);
    }

    public static char[] readFile (String filePath) {
        File inFile = new File("C:/tmp/chars.txt");
        String line;

        List<Character> charList = new ArrayList<>();

        try (Scanner in = new Scanner(inFile)){

            while (in.hasNextLine()) {
                line = in.nextLine();
                for (char ch : line.toCharArray()) {
                    if (!Character.isWhitespace(ch)) {
                        charList.add(ch);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] result = new char[charList.size()];

        for (int i = 0; i < charList.size(); i++) {
            result[i] = charList.get(i);
        }
        return result;
    }

    public static void countFrequencies(char[] chars) {
        int[][] charTable = new int[128][2];


        for (int i = 0; i < 128; i++) {
            charTable[i][0] = -1;
            charTable[i][1] = 0;
        }


        for (char ch : chars) {
            boolean found = false;


            for (int i = 0; i < 128; i++) {
                if (charTable[i][0] == ch) {
                    charTable[i][1]++;
                    found = true;
                    break;
                }
            }


            if (!found) {
                for (int i = 0; i < 128; i++) {
                    if (charTable[i][0] == -1) {
                        charTable[i][0] = ch;
                        charTable[i][1] = 1;
                        break;
                    }
                }
            }
        }


        displayResults(charTable);
    }

    public static void displayResults(int[][] charTable) {

        Arrays.sort(charTable, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]);
            } else {
                return Character.compare((char) a[0], (char) b[0]);
            }
        });


        for (int i = 0; i < 128; i++) {
            if (charTable[i][0] != -1) {
                char ch = (char) charTable[i][0];
                int frequency = charTable[i][1];
                System.out.printf("Character: '%c' | Frequency: %d\n", ch, frequency);
            }
        }
    }


}
