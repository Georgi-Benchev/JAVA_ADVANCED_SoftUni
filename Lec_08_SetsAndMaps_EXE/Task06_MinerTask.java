package JAVA_ADVANCED.Lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> minerals = new LinkedHashMap<>();

        String input = "";
        while (!"stop".equals(input = scanner.nextLine())) {
            String ore = input;
            int value = Integer.parseInt(scanner.nextLine());

            minerals.putIfAbsent(ore, 0);
            minerals.replace(ore, minerals.get(ore) + value);
        }

        minerals.entrySet().forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));

    }
}
