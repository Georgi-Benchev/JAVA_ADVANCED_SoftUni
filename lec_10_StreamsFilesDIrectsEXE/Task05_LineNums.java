package JAVA_ADVANCED.lec_10_StreamsFilesDIrectsEXE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task05_LineNums {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String pathIn = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\output.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut));

        int count = 1;
        for (String line : lines) {
            writer.write(count + ". " + line);
            writer.newLine();
            count++;

        }
        writer.close();


    }
}
