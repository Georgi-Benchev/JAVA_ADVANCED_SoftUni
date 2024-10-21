package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] comands = Arrays.stream
                (scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] chisla = Arrays.stream
                (scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> data = new ArrayDeque<>();
        for (int i = 0; i < chisla.length; i++) {
            data.push(chisla[i]);
        }

        for (int i = 0; i < comands[1]; i++) {
            data.pop();
        }

        if (data.contains(comands[2])) {
            System.out.println("true");
        } else if (data.isEmpty()) {
            System.out.println("0");
        } else {
            int n = Integer.MAX_VALUE;
            for (Integer dot : data) {
                if (dot < n) {
                    n = dot;
                }
            }
            System.out.println(n);
        }
//        5 2 13
//        1 13 45 32 4

    }
}
