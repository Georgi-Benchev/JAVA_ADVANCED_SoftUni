package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task01_ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);
        int oneByte = fileStream.read();
        while (oneByte>=0){
            System.out.printf("%s ",Integer.toBinaryString(oneByte));
            oneByte = fileStream.read();
        }
    }
}
