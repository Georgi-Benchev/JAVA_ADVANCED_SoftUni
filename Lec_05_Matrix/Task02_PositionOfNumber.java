package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_PositionOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowsAndCols[0]][];

        for (int i = 0; i < rowsAndCols[0]; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = input;
        }

        int number = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < rowsAndCols[0]; i++) {
            for (int j = 0; j < rowsAndCols[1]; j++) {

                if (number == matrix[i][j]) {
                    System.out.println(i + " " + j);
                    check = true;
                }


            }
        }
        if (!check){
            System.out.println("not found");
        }

    }
}
