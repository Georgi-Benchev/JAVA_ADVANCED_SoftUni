package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task03_CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String inPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";
        String outPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(inPath);
        FileOutputStream out = new FileOutputStream(outPath);

        int oneByte = in.read();

        while (oneByte >= 0) {
            String digit = String.valueOf(oneByte);

            if (oneByte == 10 || oneByte == 32) {
                out.write((char) oneByte);
            } else {
                for (int i = 0; i < digit.length(); i++) {

                    out.write(digit.charAt(i));
                }
            }


            oneByte = in.read();
        }


    }
}
