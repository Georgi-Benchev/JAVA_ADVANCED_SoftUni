package JAVA_ADVANCED.lec_06_Matrix_EXE;

import java.util.Scanner;

public class Task08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double atackDMG = Double.parseDouble(scanner.nextLine());
        double monsterHP = 3000000.00;
        int playerHP = 18500;

        String[][] maze = new String[15][15];
        for (int row = 0; row < 15; row++) {
            for (int col = 0; col < 15; col++) {

                maze[row][col] = "0";
            }
        }
        maze[7][7] = "1";


        int pasiveDMG = 0;
        String deathType = "";
        while (playerHP > 0 && monsterHP > 0) {

            String[] monsterAtack = scanner.nextLine().split("\\s+");
            String atackType = monsterAtack[0];
            int atackRow = Integer.parseInt(monsterAtack[1]);
            int atackCol = Integer.parseInt(monsterAtack[2]);

            String[][] mazeCoppy = new String[15][15];
            for (int row = 0; row < 15; row++) {
                for (int col = 0; col < 15; col++) {
                    mazeCoppy[row][col] = "0";
                }
            }

            mazeCoppy[atackRow][atackCol] = "*";
            if (atackRow >= 1 && atackCol >= 1) {
                mazeCoppy[atackRow - 1][atackCol - 1] = "*";
            }
            if (atackRow >= 1 && atackCol < 14) {
                mazeCoppy[atackRow - 1][atackCol + 1] = "*";
            }
            if (atackRow < 14 && atackCol >= 1) {
                mazeCoppy[atackRow + 1][atackCol - 1] = "*";
            }
            if (atackCol >= 1) {
                mazeCoppy[atackRow][atackCol - 1] = "*";
            }
            if (atackRow >= 1) {
                mazeCoppy[atackRow - 1][atackCol] = "*";
            }
            if (atackRow < 14 && atackCol < 14) {
                mazeCoppy[atackRow + 1][atackCol + 1] = "*";
            }
            if (atackRow < 14) {
                mazeCoppy[atackRow + 1][atackCol] = "*";
            }
            if (atackCol < 14) {
                mazeCoppy[atackRow][atackCol + 1] = "*";
            }

            int brakeCheck = 0;
            for (int row = 0; row < 15; row++) {
                if (brakeCheck == 1) {
                    break;
                }
                for (int col = 0; col < 15; col++) {
                    if (maze[row][col].equals("1")) {


                        if (mazeCoppy[row][col].equals("0")) {
                            monsterHP -= atackDMG;
                            brakeCheck = 1;
                            break;

                        } else { //*

                            if (row >= 1) {
                                if (mazeCoppy[row - 1][col].equals("0")) {
                                    monsterHP -= atackDMG;
                                    maze[row][col] = "0";
                                    maze[row - 1][col] = "1";
                                    brakeCheck = 1;
                                    break;
                                }
                            }
                            if (col < 14) {
                                if (mazeCoppy[row][col + 1].equals("0")) {
                                    monsterHP -= atackDMG;
                                    maze[row][col] = "0";
                                    maze[row][col + 1] = "1";
                                    brakeCheck = 1;
                                    break;
                                }
                            }
                            if (row < 14) {
                                if (mazeCoppy[row + 1][col].equals("0")) {
                                    monsterHP -= atackDMG;
                                    maze[row][col] = "0";
                                    maze[row + 1][col] = "1";
                                    brakeCheck = 1;
                                    break;
                                }
                            }
                            if (col >= 1) {
                                if (mazeCoppy[row][col - 1].equals("0")) {
                                    monsterHP -= atackDMG;
                                    maze[row][col] = "0";
                                    maze[row][col + 1] = "1";
                                    brakeCheck = 1;
                                    break;
                                }
                            }

                            if (atackType.equals("Cloud")) {
                                monsterHP -= atackDMG;
                                if (pasiveDMG > 0) {
                                    playerHP -= 3500;
                                    pasiveDMG = 0;
                                }
                                playerHP -= 3500;
                                pasiveDMG += 3500;
                                if (playerHP <= 0) {
                                    deathType = "Player: Killed by Plague Cloud";
                                    brakeCheck = 1;
                                    break;
                                }
                            } else {
                                monsterHP -= atackDMG;
                                if (pasiveDMG > 0) {
                                    playerHP -= 3500;
                                    pasiveDMG = 0;
                                    if (playerHP <= 0) {
                                        deathType = "Player: Killed by Plague Cloud";
                                        brakeCheck = 1;
                                        break;
                                    }

                                }
                                playerHP -= 6000;
                                if (playerHP <= 0) {
                                    deathType = "Player: Killed by Eruption";

                                }
                                brakeCheck = 1;
                                break;

                            }


                        }


                    }

                }
            }


        }


        int checkFor1 = 0;
        if (monsterHP <= 0) {
            System.out.println("Heigan: Defeated!");
            System.out.println("Player: " + playerHP);
            for (int row = 0; row < 15; row++) {
                if (checkFor1 == 1) {
                    break;
                }
                for (int col = 0; col < 15; col++) {
                    if (maze[row][col].equals("1")) {
                        System.out.println("Final position: " + row + ", " + col);
                        checkFor1 = 1;
                        break;
                    }
                }
            }
        } else {
            System.out.printf("Heigan: %.2f", monsterHP);
            System.out.println();
            System.out.println(deathType);
            for (int row = 0; row < 15; row++) {
                if (checkFor1 == 1) {
                    break;
                }
                for (int col = 0; col < 15; col++) {
                    if (maze[row][col].equals("1")) {
                        System.out.println("Final position: " + row + ", " + col);
                        checkFor1 = 1;
                        break;
                    }
                }
            }
        }

    }
}
