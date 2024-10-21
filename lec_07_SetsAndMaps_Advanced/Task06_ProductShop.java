package JAVA_ADVANCED.lec_07_SetsAndMaps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Double>> shops = new TreeMap<>();


        String input = "";
        while (!"Revision".equals(input = scanner.nextLine())) {
            String[] inputData = input.split(", ");
            String brandName = inputData[0];
            String productName = inputData[1];
            Double price = Double.parseDouble(inputData[2]);



            shops.putIfAbsent(brandName, new LinkedHashMap<>());
            shops.get(brandName).put(productName,price);

        }

        shops.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + "->");
            entry.getValue().entrySet().stream().forEach(element -> {
                System.out.printf("Product: %s, Price: %.1f%n", element.getKey(), element.getValue());
            });


        });


    }
}
