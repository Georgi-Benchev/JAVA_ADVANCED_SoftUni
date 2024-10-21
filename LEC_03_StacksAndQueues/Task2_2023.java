package JAVA_ADVANCED.LEC_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task2_2023 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> sum = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        Collections.addAll(sum,input);


        while (sum.size()>1){
            int numsSum = 0;
            int num1 = Integer.parseInt(sum.pop());
            String plusMinus = sum.pop();
            int num2 = Integer.parseInt(sum.pop());
            if (plusMinus.equals("-")){
                numsSum=num1-num2;
            }else {
                numsSum=num1+num2;
            }
            sum.push(String.valueOf(numsSum));

        }

        System.out.println(sum.peek());

    }
}
