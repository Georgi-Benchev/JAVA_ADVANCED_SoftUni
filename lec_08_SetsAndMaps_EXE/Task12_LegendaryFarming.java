package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.*;

public class Task12_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> outputWonItem = new HashMap<>();
        outputWonItem.put("shards", "Shadowmourne obtained!");
        outputWonItem.put("fragments", "Valanyr obtained!");
        outputWonItem.put("motes", "Dragonwrath obtained!");

        Map<String, Integer> coolItems = new TreeMap<>();

        Map<String, Integer> junkItems = new TreeMap<>();
        coolItems.put("shards", 0);
        coolItems.put("fragments", 0);
        coolItems.put("motes", 0);

        boolean getOut = true;
        while (getOut) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {

                String element = input[i + 1];
                element = element.toLowerCase(Locale.ROOT);
                int quantity = Integer.parseInt(input[i]);


                if (element.equals("shards") || element.equals("fragments") || element.equals("motes")) {
                    coolItems.put(element, coolItems.get(element) + quantity);
                    if (coolItems.get(element) >= 250) {
                        System.out.println(outputWonItem.get(element));
                        coolItems.put(element, coolItems.get(element) - 250);
                        getOut = false;
                        break;
                    }
                } else {
                    if (!junkItems.containsKey(element)) {
                        junkItems.put(element, quantity);
                    } else {
                        junkItems.put(element, junkItems.get(element) + quantity);
                    }
                }
            }
        }


        coolItems.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue());
        });
        junkItems.entrySet().forEach(el -> {
            System.out.println(el.getKey() + ": " + el.getValue());
        });


    }
}
