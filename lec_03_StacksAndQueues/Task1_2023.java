package JAVA_ADVANCED.lec_03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        ArrayDeque<String> urls = new ArrayDeque<>();

        while (!"Home".equals(input= scanner.nextLine())){

            if (input.equals("back")){
                if (urls.size()>1){
                    urls.pop();
                    System.out.println(urls.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }else {
                urls.push(input);
                System.out.println(urls.peek());
            }


        }


    }
}
