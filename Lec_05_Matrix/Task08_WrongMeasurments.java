package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task08_WrongMeasurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];
        int[][] newMatrix = new int[n][];

        for (int i = 0; i < n; i++) {
            int[] inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputLine;
        }

        String newInput = "";

        for (int j = 0; j < matrix[0].length; j++) {
            newInput += 0;
        }
        for (int i = 0; i < n; i++) {
            newMatrix[i] = Arrays.stream(newInput.split("")).mapToInt(Integer::parseInt).toArray();
        }

        int[] wrongIntCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = wrongIntCoordinates[0];
        int pol = wrongIntCoordinates[1];

        int wrongNum = matrix[row][pol];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sum = 0;

                if (matrix[i][j] == wrongNum) {
                    if (i > 0) {
                        if (matrix[i - 1][j] == wrongNum) {
                            sum += 0;
                        } else {
                            sum += matrix[i - 1][j];
                        }
                    }
                    if (i < n - 1) {
                        if (matrix[i + 1][j] == wrongNum) {
                            sum += 0;
                        } else {
                            sum += matrix[i + 1][j];
                        }
                    }
                    if (j > 0) {
                        if (matrix[i][j - 1] == wrongNum) {
                            sum += 0;
                        } else {
                            sum += matrix[i][j - 1];
                        }
                    }
                    if (j < matrix[i].length - 1) {
                        if (matrix[i][j + 1] == wrongNum) {
                            sum += 0;
                        } else {
                            sum += matrix[i][j + 1];
                        }
                    }
                    newMatrix[i][j] = sum;
                } else {
                    int number = matrix[i][j];
                    newMatrix[i][j] = number;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
