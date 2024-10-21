package JAVA_ADVANCED.Lec_04_EXE;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task10_Robotics_TO_DO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(";");
        String time = scanner.nextLine();
        LinkedHashMap<String, Integer> dataMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            String[] putingInput = input[i].split("-");
            dataMap.put(putingInput[0], Integer.valueOf(putingInput[1]));
        }
    }
}
