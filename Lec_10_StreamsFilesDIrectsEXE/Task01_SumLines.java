package JAVA_ADVANCED.Lec_10_StreamsFilesDIrectsEXE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task01_SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));

        for (int i = 0; i < lines.size(); i++) {
            int sum = 0;
            String curentLine = lines.get(i);
            for (int j = 0; j <curentLine.length() ; j++) {
                sum+=curentLine.charAt(j);
            }
            System.out.println(sum);



        }


    }
}
