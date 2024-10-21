package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task8_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = "";
        ArrayDeque<String> backUrls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        while (!"Home".equals(inputLine = scanner.nextLine())) {

            if (inputLine.equals("forward")) {
                if (forwardUrls.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardUrls.peek());
                    backUrls.addFirst(forwardUrls.pop());
                }
            } else if (inputLine.equals("back")) {
                if (backUrls.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardUrls.push(backUrls.pop());
                    System.out.println(backUrls.peek());
                }
            } else {
                System.out.println(inputLine);
                backUrls.push(inputLine);
            }

        }

    }
}
