package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputLine = scanner.nextLine();
        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < inputLine.length(); i++) {
            char n = inputLine.charAt(i);
            symbols.putIfAbsent(n, 0);
            symbols.replace(n, symbols.get(n) + 1);
        }

        symbols.entrySet().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");
        });

    }
}
