package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task08_Infix_to_Posfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> outputQueue = new ArrayDeque<>();
        ArrayDeque<String> symbolsStack = new ArrayDeque<>();
        int symbolsWeight = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                symbolsStack.push(input[i]);
            } else if (input[i].equals(")")) {
                while (!symbolsStack.peek().equals("(")) {
                    outputQueue.offer(symbolsStack.pop());
                }
                symbolsStack.pop();
            } else if (input[i].equals("*") || input[i].equals("/")) {
                if (symbolsStack.isEmpty() || symbolsStack.peek().equals("(") || symbolsStack.peek().equals("+") || symbolsStack.peek().equals("-")) {
                    symbolsStack.push(input[i]);
                } else {
                    outputQueue.offer(symbolsStack.pop());
                    symbolsStack.push(input[i]);
                }


            } else if (input[i].equals("+") || input[i].equals("-")) {
                if (symbolsStack.isEmpty() || symbolsStack.peek().equals("(")) {
                    symbolsStack.push(input[i]);
                } else {
                    outputQueue.offer(symbolsStack.pop());
                    symbolsStack.push(input[i]);
                }
            } else {
                outputQueue.offer(input[i]);
            }
        }

        while (!symbolsStack.isEmpty()) {
            outputQueue.offer(symbolsStack.pop());
        }
        String output = "";
        int size = outputQueue.size();
        for (int i = 0; i < size; i++) {
            output += outputQueue.poll() + " ";
        }

        System.out.println(output);
    }
}
