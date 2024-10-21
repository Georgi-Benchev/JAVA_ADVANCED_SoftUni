package JAVA_ADVANCED.lec_04_StacksAndQueues_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> history = new ArrayDeque<>();
        String text = "";

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("1")) {
                text += input[1];
                String addedText = "1" + input[1];
                history.push(addedText);
            } else if (input[0].equals("2")) {
                String deletedText = "2";
                for (int j = text.length() - Integer.parseInt(input[1]); j < text.length(); j++) {
                    deletedText += text.charAt(j);

                }
                int count = text.length();
                for (int j = count - Integer.parseInt(input[1]); j < count; j++) {
                    text = text.substring(0, text.length() - 1);
                }
                history.push(deletedText);
            } else if (input[0].equals("3")) {
                System.out.println(text.charAt(Integer.parseInt(input[1]) - 1));
            } else if (input[0].equals("4")) {

                if (history.peek().charAt(0) == (49)) {
                    text = text.substring(0, text.length() + 1 - history.pop().length());
                } else {
                    text += history.peek().substring(1, history.pop().length());
                }
            }


        }


    }
}
