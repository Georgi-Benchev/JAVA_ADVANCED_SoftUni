package JAVA_ADVANCED.lec_07_SetsAndMaps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04_CountRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNums = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < inputNums.length; i++) {
            if (counter.containsKey(inputNums[i])) {
                counter.replace(inputNums[i], counter.get(inputNums[i]), counter.get(inputNums[i]) + 1);
            } else {
                counter.put(inputNums[i], 1);
            }
        }

        for (Double number : counter.keySet()) {
            System.out.printf("%.1f -> %d%n",number,counter.get(number));
        }
//        for (Map.Entry<Double,Integer> entry : counter.entrySet()){
//            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
//
//        }
    }
}
