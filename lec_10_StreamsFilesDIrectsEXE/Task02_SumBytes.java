package JAVA_ADVANCED.lec_10_StreamsFilesDIrectsEXE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task02_SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);



        String pathIn = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_10_\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));
        long sum = 0;

        for (int i = 0; i < lines.size(); i++) {
            String curentLine = lines.get(i);
            for (int j = 0; j <curentLine.length() ; j++) {
                sum+=curentLine.charAt(j);
            }
        }

        System.out.println(sum);


    }
}
