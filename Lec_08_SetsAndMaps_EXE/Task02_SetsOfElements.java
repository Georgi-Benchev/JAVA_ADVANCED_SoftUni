package JAVA_ADVANCED.Lec_08_SetsAndMaps_EXE;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lineOne = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int firstLength = lineOne[0];
        int secondLength = lineOne[1];


        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> repeatingNums = new LinkedHashSet<>();

        for (int i = 0; i < firstLength; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondLength; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.forEach(e -> {
            if (secondSet.contains(e)){
                repeatingNums.add(e);
            }
        });
        repeatingNums.forEach(e -> System.out.print(e+" "));


    }
}
