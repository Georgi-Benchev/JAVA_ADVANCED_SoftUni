package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> data = new LinkedHashSet<>();

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            data.add(input);
        }

        data.forEach(System.out::println);

    }
}
