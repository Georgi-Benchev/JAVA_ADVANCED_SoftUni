package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task06_SortLines {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\input.txt";
        String outPath = "C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\06.SortLinesOutput.txt";
        Path in = Paths.get(inPath);
        Path out = Paths.get(outPath);

        List<String> lines = Files.readAllLines(in);
        Collections.sort(lines);
        Files.write(out, lines);

    }
}
