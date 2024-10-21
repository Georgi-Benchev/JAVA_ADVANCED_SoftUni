package JAVA_ADVANCED.LEC_06_Matrix_EXE;

import java.util.Scanner;

public class Task01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);

        int[][] matrix = new int[size][size];
        int count = 1;
        if (input[1].equals("A")) {
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            }

        } else if (input[1].equals("B")) {
            for (int row = 0; row < size; row++) {


                if (row % 2 == 0) {
                    for (int col = 0; col < size; col++) {
                        matrix[col][row] = count;
                        count++;
                    }
                } else {
                    for (int col = size - 1; col >= 0; col--) {
                        matrix[col][row] = count;
                        count++;
                    }
                }


            }

        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }


}
