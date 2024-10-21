package JAVA_ADVANCED.Lec_09_StreamFilesAndDirections;

import java.io.File;

public class Task08_NestedFoldersTODO {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gega4\\IdeaProjects\\SoftUni_JAVA_ADVANCED\\src\\JAVA_ADVANCED\\Lec_09_\\Files-and-Streams");

        int count = 0;

        if (file.isDirectory()) {
            System.out.println(file.getName());
            count++;

            File[] files = file.listFiles();
            for (File fPrint : files) {
                if (fPrint.isDirectory()) {
                    count++;
                    System.out.println(fPrint.getName());
                }
            }

            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    File[] filesPrint = files[i].listFiles();

                    for (File fPrint : filesPrint) {
                        if (fPrint.isDirectory()) {
                            count++;
                            System.out.println(fPrint.getName());
                        }
                    }
                }
            }
            /*for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                    count++;
                    File[] subFiles = f.listFiles();
                    for (File subFile : subFiles) {
                        if (subFile.isDirectory()) {
                            count++;
                            System.out.println(subFile.getName());
                        }
                    }
                }
            }*/
        }

        System.out.println(count + " folders");


    }
}
