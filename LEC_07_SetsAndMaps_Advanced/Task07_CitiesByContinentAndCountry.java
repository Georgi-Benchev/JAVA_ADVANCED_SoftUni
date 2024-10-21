package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> data = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String continent = inputLine[0];
            String country = inputLine[1];
            String city = inputLine[2];

            data.putIfAbsent(continent, new LinkedHashMap<>());
            data.get(continent).putIfAbsent(country, new ArrayList<>());
            data.get(continent).get(country).add(city);

        }

        data.entrySet().stream().forEach(entry -> { // continent , MAP
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().stream().forEach(e -> {
                System.out.print(e.getKey() + " -> ");
                for (int i = 0; i < e.getValue().size(); i++) {
                    if (i != e.getValue().size() - 1) {
                        System.out.print(e.getValue().get(i) + ", ");
                    }else {
                        System.out.print(e.getValue().get(i) );
                        System.out.println();
                    }
                }
            });

        });

    }
}
