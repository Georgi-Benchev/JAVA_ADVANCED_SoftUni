package JAVA_ADVANCED.Lec_05_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Task07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][];

        for (int i = 0; i < 8; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            matrix[i] = inputLine;
        }


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                String queen = matrix[i][j];
                boolean check = true;


                if (queen.equals("q")) {

                    for (int i1 = 0; i1 < j; i1++) {
                        if (matrix[i][i1].equals("q")) {
                            check = false;
                            break;
                        }
                    }
                    for (int i2 = j + 1; i2 < 8; i2++) {
                        if (matrix[i][i2].equals("q")) {
                            check = false;
                            break;
                        }
                    }

                    for (int i3 = 0; i3 < i; i3++) {
                        if (matrix[i3][j].equals("q")) {
                            check = false;
                            break;
                        }
                    }
                    for (int i4 = i + 1; i4 < 8; i4++) {
                        if (matrix[i4][j].equals("q")) {
                            check = false;
                            break;
                        }
                    }


                    int localI = i;
                    int localJ = j;
                    while (localI > 0 && localJ > 0) {
                        if (matrix[localI - 1][localJ - 1].equals("q")) {
                            check = false;
                            break;
                        }
                        localI--;
                        localJ--;
                    }

                    localI = i;
                    localJ = j;
                    while (localI < 7 && localJ < 7) {
                        if (matrix[localI + 1][localJ + 1].equals("q")) {
                            check = false;
                            break;
                        }
                        localI++;
                        localJ++;
                    }


                    localI = i;
                    localJ = j;
                    while (localI < 7 && localJ > 0) {
                        if (matrix[localI + 1][localJ - 1].equals("q")) {
                            check = false;
                            break;
                        }
                        localI++;
                        localJ--;
                    }


                    localI = i;
                    localJ = j;
                    while (localI > 0 && localJ < 7) {
                        if (matrix[localI - 1][localJ + 1].equals("q")) {
                            check = false;
                            break;
                        }
                        localI--;
                        localJ++;
                    }


                    //    1  1  1  1  1  1  1  1        i=3  j=2
                    //    1  1  1  1  1  1  1  1
                    //    1  1  1  1  1  1  1  1
                    //    1  1  Q  1  1  1  1  1
                    //    1  1  1  1  1  1  1  1
                    //    1  1  1  1  1  1  1  1
                    //    1  1  1  1  1  1  1  1
                    //    1  1  1  1  1  1  1  1


                } else {
                    check = false;
                }


                if (check) {
                    System.out.println(i + " " + j);
                    break;
                }

            }
        }


    }
}
