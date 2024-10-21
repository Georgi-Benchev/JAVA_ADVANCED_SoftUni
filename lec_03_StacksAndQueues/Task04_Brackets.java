package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task04_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        ArrayDeque<String> resultsStack = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {

            String ch = String.valueOf(input.charAt(i));

            if ("(".equals(ch)) {
                resultsStack.push(String.valueOf(i));
            } else if (ch.equals(")")) {
                int startIndex = Integer.parseInt(resultsStack.pop());
                int endIndex = i;
                String substring = input.substring(startIndex,endIndex+1);
                System.out.println(substring);

            }


        }


    }
}
