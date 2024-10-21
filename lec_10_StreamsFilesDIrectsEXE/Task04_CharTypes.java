package JAVA_ADVANCED.lec_10_StreamsFilesDIrectsEXE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task04_CharTypes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\input.txt";
        String pathOut = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\output.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut));

        int vowels = 0;
        int punct = 0;
        int consonants = 0;

        for (String line : lines) {
            char[] symbols = line.toCharArray();
            for (char symbol : symbols) {
                if (symbol == 32) {
                    continue;
                } else if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                    vowels++;
                } else if (symbol == '!' || symbol == '.' || symbol == ',' || symbol == '?') {
                    punct++;
                } else {
                    consonants++;
                }
            }

        }
        writer.write("Vowels: " + vowels);
        writer.newLine();
        writer.write("Consonants: " + consonants);
        writer.newLine();
        writer.write("Punctuation: " + punct);
        writer.close();
    }
}
