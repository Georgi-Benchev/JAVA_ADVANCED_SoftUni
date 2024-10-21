package JAVA_ADVANCED.lec_11_FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Double> addVat = e -> Double.parseDouble(e) * 1.2;
        List<Double> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(addVat).collect(Collectors.toList());
        System.out.println("Prices with VAT:");
        input.forEach(e -> System.out.printf("%.2f%n", e));


    }
}
