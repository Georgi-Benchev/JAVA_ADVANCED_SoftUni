package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Scanner;

public class Task06_MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotation = scanner.nextLine().split("\\(");
        String rotNumber = rotation[1].replace(')', ' ');
        int num = Integer.parseInt(rotNumber.trim()) % 360;


        String[] dataBase1 = new String[1000];
        String inputLine = "";

        int countRounds = 0;
        int sizeBest = 0;

        while (!"END".equals(inputLine = scanner.nextLine())) {
            dataBase1[countRounds] = inputLine;
            countRounds++;

            if (inputLine.length() >= sizeBest) {
                sizeBest = inputLine.length();
            }

        }


        String[] input = new String[countRounds];
        for (int i = 0; i < countRounds; i++) {
            input[i] = dataBase1[i];
            for (int j = input[i].length(); j < sizeBest; j++) {
                input[i] += " ";
            }
        }

        if (num == 0) { //ok
            String[][] matrix = new String[countRounds][sizeBest];
            int rows = countRounds;
            int cols = sizeBest;

            for (int row = 0; row < rows; row++) {
                matrix[row] = input[row].split("");
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }


        } else if (num == 90) { // ok
            String[][] matrix = new String[sizeBest][countRounds];
            int rows = sizeBest;
            int cols = countRounds;

            int count = 0;
            int count2 = 0;

            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = String.valueOf(input[count2].charAt(count));
                    count++;
                }
                count = 0;
                count2++;
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

        } else if (num == 180) { // ok
            String[][] matrix = new String[countRounds][sizeBest];
            int rows = countRounds;
            int cols = sizeBest;
            int count = 0;
            int count2 = 0;
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    matrix[row][col] = String.valueOf(input[count2].charAt(count));
                    count++;
                }
                count = 0;
                count2++;
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }


        } else if (num == 270) {
            String[][] matrix = new String[sizeBest][countRounds];
            int cols = countRounds;
            int rows = sizeBest;


            int count = 0;
            int count2 = 0;

            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    matrix[row][col] = String.valueOf(input[count2].charAt(count));
                    count++;
                }
                count = 0;
                count2++;
            }


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }


        }


    }
}
