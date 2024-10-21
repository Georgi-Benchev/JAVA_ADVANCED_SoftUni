package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_Shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[dimentions[0]][dimentions[1]];

        for (int rows = 0; rows < dimentions[0]; rows++) {
            matrix[rows] = scanner.nextLine().split("\\s+");
        }

        String input = "";


        while (!"END".equals(input = scanner.nextLine())) {

            String[] inputLine = input.split("\\s+");
            if (inputLine[0].equals("swap") && inputLine.length == 5) {
                int row1 = Integer.parseInt(inputLine[1]);
                int col1 = Integer.parseInt(inputLine[2]);
                int row2 = Integer.parseInt(inputLine[3]);
                int col2 = Integer.parseInt(inputLine[4]);

                int mainRow = dimentions[0];
                int mainCol = dimentions[1];

                if (row1 <= mainRow && row1 >= 0 && row2 <= mainRow && row2 >= 0
                        && col1 <= mainCol && col1 >= 0 && col2 <= mainCol && col2 >= 0) {


                    String savedData = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = savedData;

                    for (int row = 0; row < mainRow; row++) {
                        for (int col = 0; col < mainCol; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }

                } else {
                    System.out.println("Invalid input!");
                }

            } else {
                System.out.println("Invalid input!");
            }


        }
    }
}
