package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> opashka = new ArrayDeque<>();

        if (data[0] <= data[1]) {
            System.out.println("0");
        } else {

            for (int i = 0; i < data[0]; i++) {
                opashka.offer(input[i]);
            }

            for (int i = 0; i < data[1]; i++) {
                opashka.poll();
            }

            if (opashka.contains(data[2])) {
                System.out.println("true");
            } else {
                int n = Integer.MAX_VALUE;
                for (int pesho : opashka) {
                    if (pesho<n){
                        n=pesho;
                    }
                }
                System.out.println(n);
            }
//            4 1 666
//            666 69 13 420
        }

    }
}
