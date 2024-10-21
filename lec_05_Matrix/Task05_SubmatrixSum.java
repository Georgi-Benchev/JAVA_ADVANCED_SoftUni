package JAVA_ADVANCED.lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_SubmatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] inputMatrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int[] readingRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            inputMatrix[i] = readingRow;
        }

        int sum = 0;
        int[][] subMatrix = new int[2][2];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int rowTopLeft = inputMatrix[i][j];
                int rowTopRight = inputMatrix[i][j + 1];
                int rowBotomLeft = inputMatrix[i + 1][j];
                int rowBotomRight = inputMatrix[i + 1][j + 1];
                int localSum = rowBotomLeft + rowBotomRight + rowTopLeft + rowTopRight;
                if (localSum > sum) {
                    sum = localSum;
                    subMatrix[0][0] = rowTopLeft;
                    subMatrix[0][1] = rowTopRight;
                    subMatrix[1][0] = rowBotomLeft;
                    subMatrix[1][1] = rowBotomRight;
                }
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(subMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
