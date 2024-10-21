package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> revNums = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            revNums.push(input[i]);
        }
        for (String n : revNums) {
            System.out.print(n+" ");
        }
    }
}
