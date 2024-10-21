package JAVA_ADVANCED.Lec_10_StreamsFilesDIrectsEXE;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task03_ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String pathIn = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\input.txt";
        String pathOut = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\output.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut));

        for (int i = 0; i < lines.size(); i++) {
            String curentLine = lines.get(i);
            Files.writeString(Path.of(pathOut), curentLine.toUpperCase(Locale.ROOT));
        }

        for (String line : lines) {
            writer.write(line.toUpperCase(Locale.ROOT));
            writer.newLine();

        }
        writer.close();


    }
}
