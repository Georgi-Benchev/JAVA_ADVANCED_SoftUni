package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task03_DecimalToBINARY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNums = new ArrayDeque<>();


        if (input == 0) {
            System.out.println("0");
        }

        while (input != 0) {

            binaryNums.push(input % 2);
            input = input / 2;
        }

        for (Integer number : binaryNums ) {
            System.out.print(number);

        }


    }
}
