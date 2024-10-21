package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task05_BalansedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");
        ArrayDeque openinSkoba = new ArrayDeque<>();
        ArrayDeque closingSkoba = new ArrayDeque<>();
        boolean check = true;


        for (int i = 0; i < input.length; i++) {

            if (input[i].equals("(")) {
                openinSkoba.push(input[i]);
            } else if (input[i].equals("{")) {
                openinSkoba.push(input[i]);
            } else if (input[i].equals("[")) {
                openinSkoba.push(input[i]);
            } else {
                if (openinSkoba.isEmpty()) {
                    check = false;
                    break;
                }
                if (input[i].equals(")") && openinSkoba.peek().equals("(")) {
                    openinSkoba.pop();
                } else if (input[i].equals("}") && openinSkoba.peek().equals("{")) {
                    openinSkoba.pop();
                } else if (input[i].equals("]") && openinSkoba.peek().equals("[")) {
                    openinSkoba.pop();
                } else {
                    check = false;
                    break;
                }
            }


        }


        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
