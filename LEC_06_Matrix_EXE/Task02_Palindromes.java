package JAVA_ADVANCED.LEC_06_Matrix_EXE;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cols = input[0];
        int rows = input[1];

        String[][] matrix = new String[rows][cols];


        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                char firstLast = (char) ((char) 97+col);
                char midlle = (char) ((char) 97+col+row);
                String pesho = ""+firstLast+midlle+firstLast;
                matrix[row][col] = pesho;
                System.out.print(pesho);
                System.out.print(" ");



            }
            System.out.println();
        }


    }
}
