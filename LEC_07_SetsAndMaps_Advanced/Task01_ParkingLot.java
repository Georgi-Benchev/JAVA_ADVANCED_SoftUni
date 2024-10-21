package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> numberPlates = new LinkedHashSet<>();
        String input = "";

        while (!"END".equals(input = scanner.nextLine())) {
            String[] plateInput = input.split(", ");
            if (plateInput[0].equals("IN")) {
                numberPlates.add(plateInput[1]);
            }else {
                numberPlates.remove(plateInput[1]);
            }
        }

        if (numberPlates.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String numberPlate : numberPlates) {
                System.out.println(numberPlate);
            }
        }

    }
}
