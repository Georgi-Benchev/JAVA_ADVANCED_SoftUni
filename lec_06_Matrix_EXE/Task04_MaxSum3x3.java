package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_MaxSum3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] colInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = colInput;
        }

        // napulnena matrica


        //logika za 3x3

        int bestSum = Integer.MIN_VALUE;
        int[][] bestMatrix = new int[3][3];
        int sum = 0;
        int[][] checkMatrix = new int[3][3];


        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                for (int row3x3 = 0; row3x3 < 3; row3x3++) {
                    for (int col3x3 = 0; col3x3 < 3; col3x3++) {
                        sum += matrix[row + row3x3][col + col3x3];
                        checkMatrix[row3x3][col3x3] = matrix[row + row3x3][col + col3x3];
                    }
                }
                if (sum > bestSum) {
                    bestSum = sum;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            bestMatrix[i][j] = checkMatrix[i][j];
                        }
                    }
                }
                sum = 0;
            }
        }

        System.out.println("Sum = " + bestSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bestMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
