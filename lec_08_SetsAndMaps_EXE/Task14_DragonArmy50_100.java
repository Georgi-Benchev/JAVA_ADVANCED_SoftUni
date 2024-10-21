package JAVA_ADVANCED.lec_08_SetsAndMaps_EXE;

import java.util.*;

public class Task14_DragonArmy50_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, TreeMap<String, int[]>> allData = new LinkedHashMap<>();
        Map<String, double[]> avgStats = new LinkedHashMap<>();



        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String typeDragon = "";
            typeDragon = input[0];
            String nameDragon = "";
            nameDragon = input[1];
            String damageStr = "";
            damageStr = input[2];

            String hpStr = "";
            hpStr = input[3];

            String armorStr = "";
            armorStr = input[4];

            if (damageStr.equals("null")) {     //               {damage}/{health}/{armor}
                damageStr = "45";
            }
            if (hpStr.equals("null")) {
                hpStr = "250";
            }
            if (armorStr.equals("null")) {
                armorStr = "10";
            }

            int damage = Integer.parseInt(damageStr);
            int hp = Integer.parseInt(hpStr);
            int armor = Integer.parseInt(armorStr);
            double[] doubleValues = new double[3];
            doubleValues[0] = damage;
            doubleValues[1] = hp;
            doubleValues[2] = armor;
            int[] valuesData = new int[3];
            valuesData[0] = damage;
            valuesData[1] = hp;
            valuesData[2] = armor;

            if (!allData.containsKey(typeDragon)) {
                allData.put(typeDragon, new TreeMap<String, int[]>());
                allData.get(typeDragon).put(nameDragon, valuesData);
                avgStats.put(typeDragon, doubleValues);
            } else {
                if (!allData.get(typeDragon).containsKey(nameDragon)) {
                    allData.get(typeDragon).put(nameDragon, valuesData);
                } else {
                    allData.get(typeDragon).get(nameDragon)[0] = valuesData[0];
                    allData.get(typeDragon).get(nameDragon)[1] = valuesData[1];
                    allData.get(typeDragon).get(nameDragon)[2] = valuesData[2];
                }
                double[] localDoubleValues = new double[avgStats.get(typeDragon).length + 3];
                for (int j = 0; j < localDoubleValues.length - 3; j++) {
                    localDoubleValues[j] = avgStats.get(typeDragon)[j];
                }

                localDoubleValues[localDoubleValues.length - 3] = doubleValues[0];
                localDoubleValues[localDoubleValues.length - 2] = doubleValues[1];
                localDoubleValues[localDoubleValues.length - 1] = doubleValues[2];
                avgStats.put(typeDragon, localDoubleValues);
            }
        }

        allData.entrySet().forEach(e -> {  //  Red <Bazgargal> <100 2500 25>
            System.out.print(e.getKey() + "::");
            printAvg(avgStats.get(e.getKey()));
            e.getValue().entrySet().forEach(entry -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n"
                        , entry.getKey(), entry.getValue()[0], entry.getValue()[1], entry.getValue()[2]);
            });
        });


    }

    private static void printAvg(double[] stats) {
        int size = stats.length;
        int division = stats.length / 3;
        double[] printStats = new double[3];
        printStats[0] = stats[0];
        printStats[1] = stats[1];
        printStats[2] = stats[2];
        for (int i = 3; i < size; i += 3) {
            printStats[0] = printStats[0] + stats[i];
            printStats[1] = printStats[1] + stats[i + 1];
            printStats[2] = printStats[2] + stats[i + 2];
        }

        for (int i = 0; i < printStats.length; i++) {
            printStats[i] = (printStats[i] / division);
        }

        System.out.printf("(%.2f/%.2f/%.2f)%n", printStats[0], printStats[1], printStats[2]);
    }
}
