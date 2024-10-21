package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Arrays;
import java.util.Scanner;

public class Task07_CrossfireTODO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[0];
        String[][] matrix = new String[rows][cols];

        int count = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = String.valueOf(count);
                count++;
            }
        }


        String inputLine = "";

        while (!"Nuke it from orbit".equals(inputLine = scanner.nextLine())) {
            int[] inputData = Arrays.stream(inputLine.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int nukeRow = inputData[0];
            int nukeCol = inputData[1];
            int nukeRadius = inputData[2];

            matrix[nukeRow][nukeCol] = "";
            matrix[nukeRow][nukeCol+1] = "";


            for (int row = 0; row <5 ; row++) {
                for (int col = 0; col <5 ; col++) {

                    System.out.print(matrix[row][col]+" ");


                }
                System.out.println();
            }

        }


    }
}
