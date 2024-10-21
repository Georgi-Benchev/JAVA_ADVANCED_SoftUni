package JAVA_ADVANCED.lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] firstMatrix = new int[parameters[0]][];

        for (int i = 0; i < parameters[0]; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = input;
        }
        int[] parameters2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] secondMatrix = new int[parameters2[0]][];

        for (int i = 0; i < parameters2[0]; i++) {
            int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            secondMatrix[i] = input2;
        }

        boolean check = true;
        if (parameters[0] != parameters2[0] || parameters[1] != parameters2[1]) {
            check=false;
        }else{
            for (int i = 0; i <parameters[0] ; i++) {
                for (int j = 0; j < parameters[1]; j++) {
                    if (firstMatrix[i][j]!=secondMatrix[i][j]){
                        check=false;
                        break;
                    }
                }
            }
        }

        if (check){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
