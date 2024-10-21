package JAVA_ADVANCED.Lec_11_FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task03_UpperCaseCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> Character.isUpperCase(e.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(input.size());
        input.forEach(System.out::println);

    }
}
