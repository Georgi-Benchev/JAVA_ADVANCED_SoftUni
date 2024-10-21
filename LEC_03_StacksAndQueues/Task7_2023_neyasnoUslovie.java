package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task7_2023_neyasnoUslovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        String[] inputMasiv = lineInput.split("\\s+");
        ArrayDeque<String> data = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputMasiv.length; i++) {
            data.offer(inputMasiv[i]);
        }
        int count = 1;
        while (data.size() > 1) {

            for (int i = 0; i < n; i++) {
                data.offer(data.poll());
            }
            if (count % 2 == 0) {
                System.out.println("Prime " + data.peek());
            } else {
                System.out.println("Removed " + data.poll());

            }

            count++;
        }
        System.out.println("Last is " + data.peek());


    }
}
