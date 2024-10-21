package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> data = new TreeSet<>();

        for (int i = 0; i <n ; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            for (int j = 0; j < inputLine.length; j++) {
                data.add(inputLine[j]);
            }

        }
        data.forEach(e-> System.out.print(e+" "));


    }
}
