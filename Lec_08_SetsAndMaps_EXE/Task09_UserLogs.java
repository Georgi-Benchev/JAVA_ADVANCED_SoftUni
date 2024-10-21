package JAVA_ADVANCED.Lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task09_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {
            String[] inputData = input.split(" ");
            String ip = inputData[0].substring(3, inputData[0].length());
            String user = inputData[2].substring(5, inputData[2].length());


            if (!userLogs.containsKey(user)) {
                LinkedHashMap<String, Integer> ipMap = new LinkedHashMap<>();
                ipMap.put(ip, 1);
                userLogs.put(user, ipMap);
            } else {
                LinkedHashMap<String, Integer> ipMap = new LinkedHashMap<>();
                ipMap = userLogs.get(user);
                if (!ipMap.containsKey(ip)) {
                    userLogs.get(user).put(ip, 1);
                } else {
                    int count = userLogs.get(user).get(ip);
                    LinkedHashMap<String, Integer> pesho = new LinkedHashMap<>();
                    pesho.put(ip, count);
                    count++;
                    userLogs.get(user).put(ip, count);

                }


            }

        }

        userLogs.entrySet().forEach(e -> {

            System.out.println(e.getKey() + ": ");
            String[] output = new String[1];
            output[0] = "";
            e.getValue().entrySet().forEach(entry -> {
                String aoutput = entry.getKey() + " => " + entry.getValue() + ", ";
                output[0] += aoutput;

            });
            String finalOutput = output[0];
            if (finalOutput.length() > 1) {

                System.out.println(finalOutput.substring(0, finalOutput.length() - 2) + ".");
            }
        });

    }
}
