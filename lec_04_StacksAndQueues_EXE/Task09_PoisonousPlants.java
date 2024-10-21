package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task09_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> plantsQueue = new ArrayDeque<>();
        for (int i = 0; i < plants.length; i++) {
            plantsQueue.offer(plants[i]);
        }
        int history = Integer.MAX_VALUE;
        boolean checkGMO = false;
        int daysCount = 0;

        while (!checkGMO) {
            int size = plantsQueue.size();
            checkGMO = true;

            for (int i = 0; i < size; i++) {
                if (history < plantsQueue.peek()) {
                    history = plantsQueue.poll();
                    checkGMO = false;
                } else {
                    history = plantsQueue.peek();
                    plantsQueue.offer(plantsQueue.poll());
                }
            }
            history = Integer.MAX_VALUE;
            daysCount++;
        }


        System.out.println(daysCount - 1);
    }
}
