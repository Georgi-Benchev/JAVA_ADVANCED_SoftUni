package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task01_ReverseNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");
        ArrayDeque<String> arrayNums = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            arrayNums.push(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(arrayNums.pop()+" ");
        }


    }
}
