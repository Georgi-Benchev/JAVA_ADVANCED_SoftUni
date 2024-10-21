package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOne = new LinkedHashSet<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet()));
        Set<Integer> playerTwo = new LinkedHashSet<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet()));
        for (int i = 0; i < 50; i++) {

            if (playerOne.isEmpty()|| playerTwo.isEmpty()){
                break;
            }

            int firstCard = playerOne.iterator().next();
            playerOne.remove(firstCard);
            int secondCard = playerTwo.iterator().next();
            playerTwo.remove(secondCard);

            if (firstCard > secondCard) {
                playerOne.add(firstCard);
                playerOne.add(secondCard);
            } else if (secondCard > firstCard) {
                playerTwo.add(secondCard);
                playerTwo.add(firstCard);
            } else {
                playerOne.add(firstCard);
                playerTwo.add(secondCard);
            }
        }


        if (playerOne.size()> playerTwo.size()){
            System.out.println("First player win!");
        }else if (playerTwo.size()> playerOne.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
