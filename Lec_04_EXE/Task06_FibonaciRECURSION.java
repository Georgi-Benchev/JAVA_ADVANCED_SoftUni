package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task06_FibonaciRECURSION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> fibonachiNums = new ArrayDeque<>();


        long nMinus1 = 0;
        long nMinus2 = 0;
        long nSum = 0;
        fibonachiNums.push(1L);
        fibonachiNums.push(1L);

        for (int i = 0; i < 48; i++) {
            nMinus1 = fibonachiNums.pop();
            nMinus2 = fibonachiNums.pop();
            nSum = nMinus1 + nMinus2;

            fibonachiNums.push(nMinus2);
            fibonachiNums.push(nMinus1);
            fibonachiNums.push(nSum);
        }

        for (int i = 0; i < 49 - n; i++) {
            fibonachiNums.pop();
        }

        System.out.println(fibonachiNums.peek());

    }
}
