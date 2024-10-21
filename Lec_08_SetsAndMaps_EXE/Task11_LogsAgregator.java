package JAVA_ADVANCED.Lec_08_SetsAndMaps_EXE;

import java.util.*;

public class Task11_LogsAgregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, TreeSet<String>> userAndIps = new TreeMap<>();
        Map<String, Integer> userAndTime = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String ip = input[0];
            String user = input[1];
            int time = Integer.parseInt(input[2]);

            if (!userAndIps.containsKey(user)) {
                userAndIps.put(user, new TreeSet<>());
                userAndIps.get(user).add(ip);
                userAndTime.put(user, time);
            } else {
                userAndIps.get(user).add(ip);
                userAndTime.put(user, userAndTime.get(user) + time);
            }

        }


        userAndTime.entrySet().forEach(e -> {
            System.out.print(e.getKey() + ": " + e.getValue());
            String[] ips = new String[1];
            ips[0] = ("");
            userAndIps.get(e.getKey()).forEach(entry -> {
                ips[0] = (ips[0] + ", " + entry);
            });
            String output = ips[0].substring(2, ips[0].length());
            System.out.println(" [" + output + "]");


        });


    }
}
