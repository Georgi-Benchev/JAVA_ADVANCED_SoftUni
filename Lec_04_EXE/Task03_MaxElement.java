package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task03_MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> arrayNums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("1")) {
                arrayNums.push(Integer.valueOf(input[1]));
            } else if (input[0].equals("2")) {
                arrayNums.pop();
            } else if (input[0].equals("3")) {
                System.out.println(Collections.max(arrayNums));
            }


        }


    }
}
