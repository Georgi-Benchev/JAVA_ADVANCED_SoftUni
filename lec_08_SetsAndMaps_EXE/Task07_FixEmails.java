package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task07_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> emailList = new LinkedHashMap<>();
        String input = "";
        while (!"stop".equals(input = scanner.nextLine())) {
            String name = input;
            String email = scanner.nextLine();
            if (email.substring(email.length() - 2, email.length()).equals("uk")
                    || email.substring(email.length() - 2, email.length()).equals("us")
                    || email.substring(email.length() - 3, email.length()).equals("com")
            ) {
            } else {
                emailList.put(name, email);
            }
        }
        emailList.entrySet().forEach(e-> System.out.printf("%s -> %s%n",e.getKey(),e.getValue()));


    }
}
