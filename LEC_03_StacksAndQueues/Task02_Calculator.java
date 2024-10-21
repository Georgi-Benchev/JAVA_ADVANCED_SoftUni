package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task02_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculatorItems = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        Collections.addAll(calculatorItems, input);


        while (calculatorItems.size() != 1) {

            int sum = 0;
            int numberOne = Integer.parseInt(calculatorItems.pop());
            String plusOrMinus = calculatorItems.pop();
            int numberTwo = Integer.parseInt(calculatorItems.pop());

            if (plusOrMinus.equals("+")) {
                sum = numberOne + numberTwo;
            }else {
                sum = numberOne - numberTwo;
            }

            calculatorItems.push(String.valueOf(sum));

        }

        System.out.println(calculatorItems.peek());
    }
}
