package JAVA_ADVANCED.Lec_11_FunctionalPrograming;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> ppl = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] localData = scanner.nextLine().split(", ");
            ppl.put(localData[0], Integer.parseInt(localData[1]));
        }

        String oldOrYoung = scanner.nextLine();
        int ageBarier = Integer.parseInt(scanner.nextLine());
        String[] neededOutput = scanner.nextLine().split("\\s+");

        if (oldOrYoung.equals("older")) {
            ppl.entrySet().stream().filter(e -> e.getValue() >= ageBarier).collect(Collectors.toList());

            if (neededOutput.length > 1) {
                ppl.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
            } else if (neededOutput[0].equals("name")) {
                ppl.entrySet().forEach(e -> System.out.println(e.getKey()));
            } else if (neededOutput[0].equals("age")) {
                ppl.entrySet().forEach(e -> System.out.println(e.getValue()));
            }

        } else if (oldOrYoung.equals("younger")) {
            ppl.entrySet().stream().filter(e -> e.getValue() < ageBarier).collect(Collectors.toList());
        } else if (neededOutput[0].equals("name")) {
            ppl.entrySet().forEach(e -> System.out.println(e.getKey()));
        } else if (neededOutput[0].equals("age")) {
            ppl.entrySet().forEach(e -> System.out.println(e.getValue()));
        }

    }
}
