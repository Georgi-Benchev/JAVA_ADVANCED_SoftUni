package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02_WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";
        String outputPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\02.WriteToFileOutput.txt";
        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);
        Set<Character> forbidenSymbols = new HashSet<>();
        forbidenSymbols.add('.');
        forbidenSymbols.add(',');
        forbidenSymbols.add('!');
        forbidenSymbols.add('?');


        int oneByte = inputStream.read();
        while (oneByte >= 0) {

            if (!forbidenSymbols.contains((char) oneByte)) {
                outputStream.write((char)oneByte);
            }
            oneByte = inputStream.read();
        }
    }
}
