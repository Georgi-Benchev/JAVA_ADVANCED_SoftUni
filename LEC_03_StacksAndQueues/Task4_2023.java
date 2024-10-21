package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task4_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> start = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            String ch = String.valueOf(input.charAt(i));
            if (ch.equals("(")) {
                start.push(i);
            } else if (ch.equals(")")) {
                int startIndex = start.pop();
                String content = input.substring(startIndex, i + 1);
                System.out.println(content);
            }


        }


    }
}
