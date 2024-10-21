package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;
//https://www.youtube.com/watch?v=q3Tpv1kM5ZU&t=10149s

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09_SortingLargestNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(3)
                .forEach(e -> System.out.print(e + " "));


    }
}
