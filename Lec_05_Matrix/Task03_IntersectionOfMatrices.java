package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Scanner;

public class Task03_IntersectionOfMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int polls = Integer.parseInt(scanner.nextLine());

        String[][] matrixOne = new String[rows][];
        for (int i = 0; i < rows; i++) {
            String[] input1 = scanner.nextLine().split("\\s+");
            matrixOne[i] = input1;
        }

        String[][] matrixTwo = new String[rows][];
        for (int i = 0; i < rows; i++) {
            String[] input2 = scanner.nextLine().split("\\s+");
            matrixTwo[i] = input2;
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < polls; j++) {
                if (matrixOne[i][j].equals(matrixTwo[i][j])) {
                    System.out.print(matrixOne[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
