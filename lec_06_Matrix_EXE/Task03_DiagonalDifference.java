package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Arrays;
import java.util.Scanner;

public class Task03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int col = 0; col <size ; col++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[col] = line;
        }

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int col = 0; col <size ; col++) {
            primaryDiagonal+=matrix[col][col];
        }
        int countRow = 0;
        for (int col = size-1; col >= 0 ; col--) {
            secondaryDiagonal+=matrix[col][countRow];
            countRow++;
        }

        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));

    }
}
