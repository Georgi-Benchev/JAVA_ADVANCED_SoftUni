package JAVA_ADVANCED.Lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Long> contryAndTotalPpl = new LinkedHashMap<>();
        Map<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();

        String input = "";

        while (!"report".equals(input = scanner.nextLine())) {
            String[] inputData = input.split("\\|"); //  Sofia|Bulgaria|1000000

            String city = inputData[0];                      //Sofia
            String country = inputData[1];                   //Bulgaria
            Long population = Long.parseLong(inputData[2]); // 1000000


            LinkedHashMap<String, Long> cityData = new LinkedHashMap<>();
            cityData.put(city, population);

            if (!contryAndTotalPpl.containsKey(country)) {
                contryAndTotalPpl.put(country, population);
            } else {
                contryAndTotalPpl.put(country, contryAndTotalPpl.get(country) + population);
            }


            if (!data.containsKey(country)) {
                data.put(country, cityData);
            } else {
                data.get(country).put(city, population);
            }

        }


        contryAndTotalPpl.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> {
                    String currentCountry = e.getKey();

                    System.out.println(currentCountry + " (total population: " + e.getValue() + ")");
                    data.get(currentCountry).entrySet().stream()
                            .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(element -> {
                                System.out.println("=>" + element.getKey() + ": " + element.getValue());

                            });

                });


    }
}
