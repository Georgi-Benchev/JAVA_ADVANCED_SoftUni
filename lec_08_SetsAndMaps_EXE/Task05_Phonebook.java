package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> phonebook = new HashMap<>();

        String input = "";
        while (!"search".equals(input = scanner.nextLine())) {
            String[] inputData = input.split("-");
            String nameContact = inputData[0];
            String number = inputData[1];

            phonebook.putIfAbsent(nameContact, number);
            phonebook.replace(nameContact, number);
        }

        while (!"stop".equals(input = scanner.nextLine())) {
            if (phonebook.containsKey(input)) {
                System.out.println(input + " -> " + phonebook.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }
        }

    }
}
