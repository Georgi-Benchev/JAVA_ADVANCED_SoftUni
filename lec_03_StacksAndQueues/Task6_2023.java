package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task6_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        ArrayDeque<String> input = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < data.length; i++) {
            input.offer(data[i]);
        }

        while (input.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                input.offer(input.poll());
            }
            System.out.println("Removed " + input.peek());
            input.poll();
        }
        System.out.println("Last is " + input.peek());
    }
}
