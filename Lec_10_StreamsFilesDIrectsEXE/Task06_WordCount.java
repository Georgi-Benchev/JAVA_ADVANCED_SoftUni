package JAVA_ADVANCED.Lec_10_StreamsFilesDIrectsEXE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task06_WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String pathInWords = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\words.txt";
        String pathInText = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\text.txt";
        String pathOut = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\result.txt";
        List<String> lines = Files.readAllLines(Path.of(pathInText));
        List<String> wordsArray = Files.readAllLines(Path.of(pathInWords));
        PrintWriter writer = new PrintWriter(new FileWriter(pathOut));
        Map<String, Integer> words = new HashMap<>();
        for (String word : wordsArray) {
            Arrays.stream(word.split("\\s+")).forEach(e -> {
                words.put(e, 0);
            });
        }

        for (String line : lines) {
            Arrays.stream(line.split("\\s+")).forEach(e -> {
                if (words.containsKey(e)) {
                    int cont = words.get(e) + 1;
                    words.put(e, cont);
                }
            });
        }

        words.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).forEach(e -> {
            writer.println(e.getKey() + " - " + e.getValue());
        });
        writer.close();
    }
}
