package JAVA_ADVANCED.Lec_10_StreamsFilesDIrectsEXE;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task07_MergeTwoFilles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String fileOnePath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\inputOne.txt";
        String fileTwoPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\inputTwo.txt";
        String fileOutPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\result.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(fileOutPath));

        List<String> data = Files.readAllLines(Path.of(fileOnePath));
        data.addAll(Files.readAllLines(Path.of(fileTwoPath)));
        data.forEach(e -> writer.println(e));
        writer.close();
    }
}
