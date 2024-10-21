package JAVA_ADVANCED.Lec_11_FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task01_SortEvenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputNums = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", inputNums));

        inputNums = inputNums
                .stream()
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ",inputNums));
    }
}
