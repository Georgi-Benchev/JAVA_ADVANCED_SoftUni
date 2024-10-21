package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOfKids = scanner.nextLine().split("\\s+");
        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < inputOfKids.length; i++) {
            kidsQueue.offer(inputOfKids[i]);
        }

        while (kidsQueue.size() != 1) {
            for (int i = 1; i < n; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }

            System.out.println("Removed " + kidsQueue.poll());
        }

        System.out.println("Last is "+ kidsQueue.poll());


    }
}
