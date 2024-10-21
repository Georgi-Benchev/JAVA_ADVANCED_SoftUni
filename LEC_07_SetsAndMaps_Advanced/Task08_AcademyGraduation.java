package JAVA_ADVANCED.LEC_07_SetsAndMaps_Advanced;

import java.util.*;

public class Task08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double sum = 0;
            for (int j = 0; j < grades.length; j++) {
                sum += grades[j];
            }
            double avGrade = sum / grades.length;
            students.putIfAbsent(student,avGrade);

        }


        students.entrySet().stream().forEach(e->{
            System.out.println(e.getKey()+" is graduated with "+e.getValue());
        });

    }
}
