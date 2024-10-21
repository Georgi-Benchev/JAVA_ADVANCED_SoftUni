package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task04_BasicQueueOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        String[] numsInput = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queueNums = new ArrayDeque<>();


        for (int i = 0; i < Integer.parseInt(nsx[0]); i++) {
            queueNums.offer(numsInput[i]);
        }

        for (int i = 0; i < Integer.parseInt(nsx[1]); i++) {
            queueNums.poll();
        }

        if (queueNums.contains(nsx[2])) {
            System.out.println("true");
        } else if (queueNums.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(queueNums));
        }


    }
}
