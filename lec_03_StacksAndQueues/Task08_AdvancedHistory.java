package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task08_AdvancedHistory {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> Urls = new ArrayDeque<>();
        ArrayDeque<String> backedUrls = new ArrayDeque<>();
        String input = "";

        while (!"Home".equals(input = scanner.nextLine())) {

            if (input.equals("back")) {
                if (Urls.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    backedUrls.push(Urls.pop());
                    System.out.println(Urls.peek());
                }
            } else if (input.equals("forward")) {
                if (backedUrls.size() ==0) {
                    System.out.println("no next URLs");
                } else {
                    Urls.push(backedUrls.pop());
                    System.out.println(Urls.peek());
                }
            } else {
                System.out.println(input);
                Urls.push(input);
                backedUrls.clear();
            }


        }


    }
}
