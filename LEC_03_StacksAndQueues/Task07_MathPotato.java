package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> kids = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            kids.offer(input[i]);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int generation = 1;


        while (kids.size() != 1) {

            for (int i = 1; i < n; i++) {
                kids.offer(kids.poll());
            }

            boolean check = false;
            if (generation == 1) {
                check = true;
            } else {
                for (int i = 2; i <= generation / 2; i++) {

                    if (generation % i == 0) {
                        check = true;
                        break;

                    }
                }
            }

            if (check) {
                System.out.println("Removed " + kids.poll());
            } else {
                System.out.println("Prime " + kids.peek());
            }

            generation++;
        }

        System.out.println("Last is " + kids.peek());
    }
}
