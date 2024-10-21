package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_SumMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowsAndCols[0]][];

        for (int i = 0; i < rowsAndCols[0]; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(rowsAndCols[0]);
        System.out.println(rowsAndCols[1]);
        int sum = 0;
        for (int i = 0; i < rowsAndCols[0]; i++) {
            for (int j = 0; j < rowsAndCols[1]; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
