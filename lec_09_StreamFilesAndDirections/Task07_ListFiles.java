package JAVA_ADVANCED.lec_09_StreamFilesAndDirections;

import java.io.File;

public class Task07_ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\Files-and-Streams");

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.isDirectory()) {
                    System.out.printf("%s: [%s]%n", f.getName(), f.length());
                }
            }
        }


    }
}
