package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.*;
import java.util.Scanner;

public class Task05_EveryThirdLine {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";
        String outPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\05.WriteEveryThirdLineOutput.txt";
        Scanner in = new Scanner(new FileReader(inPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outPath));
        int count = 1;
        String liner = in.nextLine();
        while (in.hasNextLine()) {

            if (count % 3 == 0) {
                out.println(liner);
            }
            count++;
            liner = in.nextLine();
        }
        out.close();
    }
}
