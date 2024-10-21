package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.*;

public class Task05_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> student = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            student.putIfAbsent(name, new ArrayList<>());
            student.get(name).add(grade);

        }


        student.entrySet().stream().forEach(entry -> {

                    double avrSum = 0;

                    for (int i = 0; i < entry.getValue().size(); i++) {
                        avrSum += entry.getValue().get(i);

                    }
                    avrSum = avrSum / entry.getValue().size();

            System.out.printf("%s -> ",entry.getKey());
            entry.getValue().forEach(e-> System.out.printf("%.2f ",e));
            System.out.printf("(avg: %.2f)%n",avrSum);


                }
        );
    }
}
