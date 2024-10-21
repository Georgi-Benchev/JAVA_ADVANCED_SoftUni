package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> data = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();

            if (inputLine.length() > 1) {
               data.push(inputLine.substring(2, inputLine.length() ));
            } else if (inputLine.equals("2")) {
                if (!data.isEmpty()) {
                    data.pop();
                }
            } else if (inputLine.equals("3")) {
                int max = Integer.MIN_VALUE;
                if (data.isEmpty()) {
                    max = 0;
                } else {
                    for (String line : data) {
                        int pesho = Integer.parseInt(String.valueOf(line));
                        if (max < pesho) {
                            max=pesho;
                        }

                    }
                    System.out.println(max);
                }
            }


        }


    }
}
