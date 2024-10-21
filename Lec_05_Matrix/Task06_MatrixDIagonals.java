package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task06_MatrixDIagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputLine;
        }

        String diagonalOne = "";
        String diagonalTwo = "";

        for (int i = 0; i < n; i++) {
            diagonalOne += matrix[i][i] + " ";
        }
        for (int j = 0; j < n; j++) {


            for (int i = n - 1; i >= 0; i--) {
                diagonalTwo = matrix[j][i] + " " + diagonalTwo;
            j++;
            }
        }
        System.out.println(diagonalOne);
        System.out.println(diagonalTwo);


    }
}
