package JAVA_ADVANCED.lec_11_FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_SumNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> inputNums = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());
        System.out.println("Count = " + inputNums.size());
        int sum = inputNums.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Sum = " + sum);


    }
}
