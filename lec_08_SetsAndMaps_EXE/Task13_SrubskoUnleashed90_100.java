package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task13_SrubskoUnleashed90_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Long>> allData = new LinkedHashMap<>();


        String inputLine = "";
        while (!"End".equals(inputLine = scanner.nextLine())) {
            if (inputLine.contains("@")) {
                String[] input = inputLine.split("@");
                String singerName = input[0];
                String[] otherData = input[1].split(" ");
                int check = 0;
                try {
                    int ticketPrice = Integer.parseInt(otherData[otherData.length - 2]);
                    int ticketCount = Integer.parseInt(otherData[otherData.length - 1]);
                } catch (NumberFormatException e) {
                    check = 1;
                }
                if (otherData.length > 2 && otherData.length < 5 && singerName.length() <= 3) {
                    for (int i = 0; i < otherData.length; i++) {
                        otherData[i] = otherData[i].trim();
                        if (otherData[i].isBlank()) {
                            check = 1;
                        }
                    }
                }
                if (singerName.endsWith(" ") && otherData.length > 2 && input.length == 2 && check == 0) {
                    singerName = singerName.trim();

                    Long ticketPrice = Long.parseLong(otherData[otherData.length - 2]);
                    Long ticketSold = Long.parseLong(otherData[otherData.length - 1]);
                    Long sum = ticketPrice * ticketSold;
                    String location = "";
                    for (int i = 0; i < otherData.length - 2; i++) {
                        location += otherData[i] + " ";
                    }
                    location = location.trim();

                    if (!allData.containsKey(location)) {
                        allData.put(location, new LinkedHashMap<>());
                        allData.get(location).put(singerName, sum);
                    } else {
                        if (!allData.get(location).containsKey(singerName)) {
                            allData.get(location).put(singerName, sum);
                        } else {
                            allData.get(location).put(singerName, allData.get(location).get(singerName) + sum);

                        }
                    }


                }
            }
        }

        allData.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(entry -> {
                System.out.println("#  " + entry.getKey() + " -> " + entry.getValue());
            });
        });


    }
}
