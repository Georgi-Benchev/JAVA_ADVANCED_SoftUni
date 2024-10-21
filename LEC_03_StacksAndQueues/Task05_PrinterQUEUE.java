package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task05_PrinterQUEUE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        ArrayDeque<String> printOperations = new ArrayDeque<>();


        while (!"print".equals(input = scanner.nextLine())) {

            if (input.equals("cancel")) {
                if (printOperations.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printOperations.poll());
                }
            } else {
                printOperations.offer(input);
            }

        }

        for (String printOperation : printOperations) {
            System.out.println(printOperation);
        }

    }
}
