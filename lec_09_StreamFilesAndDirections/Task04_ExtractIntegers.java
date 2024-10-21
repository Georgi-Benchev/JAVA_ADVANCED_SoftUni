package JAVA_ADVANCED.lec_09_StreamFilesAndDirections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";

        FileInputStream in = new FileInputStream(inPath);
        Scanner scanner = new Scanner(in);

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }

    }
}
