package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task5_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        ArrayDeque<String> printer = new ArrayDeque<>();

        while (!"print".equals(input = scanner.nextLine())) {
            if (input.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printer.poll());
                }
            } else {
                printer.offer(input);
            }
        }

        for (String print : printer) {
            System.out.println(print);
        }

    }
}
