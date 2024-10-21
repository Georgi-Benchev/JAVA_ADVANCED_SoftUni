package JAVA_ADVANCED.Lec_04_EXE;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        String[] inputNums = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(nsx[0]);
        int s = Integer.parseInt(nsx[1]);
        int x = Integer.parseInt(nsx[2]);

        ArrayDeque<Integer> arrayNums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            arrayNums.push(Integer.valueOf(inputNums[i]));
        }

        for (int i = 0; i < s; i++) {
            arrayNums.pop();
        }

        if (arrayNums.contains(x)) {
            System.out.println("true");
        }else if (arrayNums.isEmpty()){
            System.out.println("0");
        }else {
            int count = arrayNums.size();
            int minNum = Integer.MAX_VALUE;
            for (int i = 0; i <count ; i++) {
                int check = arrayNums.pop();
                if (minNum>check){
                    minNum=check;
                }
            }
            System.out.println(minNum);
        }


    }
}
