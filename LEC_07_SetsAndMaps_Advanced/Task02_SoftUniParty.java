package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.*;

public class Task02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> VIP = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String commandLine = "";

        while (!"PARTY".equals(commandLine = scanner.nextLine())) {
            if (commandLine.charAt(0) >= 48 && commandLine.charAt(0) <= 57) {
                VIP.add(commandLine);
            } else {
                regular.add(commandLine);
            }
        }

        while (!"END".equals(commandLine = scanner.nextLine())) {
            VIP.remove(commandLine);
            regular.remove(commandLine);
        }

        System.out.println(VIP.size() + regular.size());
        for (String s : VIP) {
            System.out.println(s);
        }
        for (String s : regular) {
            System.out.println(s);
        }

    }
}
