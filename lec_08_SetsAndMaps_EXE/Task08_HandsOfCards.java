package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.*;

public class Task08_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> data = new LinkedHashMap<>();

        String inputPlayerAndCards = "";

        while (!"JOKER".equals(inputPlayerAndCards = scanner.nextLine())) {
            String playerName = inputPlayerAndCards.split(": ")[0];
            String cards = inputPlayerAndCards.split(": ")[1];
            String[] playerCards = cards.split(", ");

            Set<String> cardsToSet = new HashSet<>();
            cardsToSet.addAll(Arrays.asList(playerCards));

            if (!data.containsKey(playerName)) {
                data.put(playerName, cardsToSet);
            }else {
                Set<String> pesho = data.get(playerName);
                pesho.addAll(cardsToSet);
                data.put(playerName, pesho);
            }

        }
        data.entrySet().forEach(e -> {
            String name = e.getKey();
            int value = calcSum(e.getValue());
            System.out.println(name + ": " + value);
        });

    }

    private static int calcSum(Set<String> cardsSet) {

        Map<String, Integer> value = digitValue();

        int sum = 0;
        for (String card : cardsSet) {

            int points = 0;
            if (card.startsWith("1")) {
                points = 10 * value.get(card.substring(2, 3));
            } else {
                points = value.get(card.substring(0, 1)) * value.get(card.substring(1, 2));

            }
            sum += points;
        }
        return sum;


    }

    private static Map<String, Integer> digitValue() {
        Map<String, Integer> allValues = new HashMap<>();
        allValues.put("1", 10);
        allValues.put("2", 2);
        allValues.put("3", 3);
        allValues.put("4", 4);
        allValues.put("5", 5);
        allValues.put("6", 6);
        allValues.put("7", 7);
        allValues.put("8", 8);
        allValues.put("9", 9);
        allValues.put("J", 11);
        allValues.put("Q", 12);
        allValues.put("K", 13);
        allValues.put("A", 14);
        allValues.put("C", 1);
        allValues.put("D", 2);
        allValues.put("H", 3);
        allValues.put("S", 4);
        return allValues;
    }


}
