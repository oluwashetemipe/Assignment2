import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7_21 {
    private static final int PEN_UP = 1;
    private static final int PEN_DOWN = 2;
    private static final int RIGHT = 3;
    private static final int LEFT = 4;
//    private static final int MOVE = 3;
    private static final int DISPLAY_ARRAY = 6;
    private static final int END = 9;
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        int commands;
        int spaces;
//        int[][] move = new int[1][1];
        int[][] currentPosition = new int[1][2];
        int rowPosition = currentPosition[0][0];
        int columnPosition = currentPosition[0][1];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a command: 1 - Pen up, 2 - Pen down");
        while (input.hasNext()) {
            commands = input.nextInt();
            if (commands == PEN_UP) {
                System.out.println("Pen up, your turtle would move freely without traces:");
            } else if (commands == PEN_DOWN) {
                System.out.println("Pen down, your turtle would move with traces emerging in shapes,please input 3 to go right or 4 to go left:");
                commands = input.nextInt();
                while (commands != END) {
                    if (commands == RIGHT) {
                        System.out.println("Please enter how many spaces right you'd like to move:");
                        spaces = input.nextInt();
                        System.out.printf("%d%d%n", rowPosition, columnPosition);
                        if (rowPosition == 0 && columnPosition == 0) {
                            for (int i = 1; i < spaces; i++) {
                                floor[rowPosition][i] = 1;
                                columnPosition += 1;
                            }
                            currentPosition[0][0] = rowPosition;
                            currentPosition[0][1] = columnPosition;
                            System.out.printf("%d%d", rowPosition, columnPosition);
                            System.out.println("Please input 3 to go right or 4 to go left:(after space is set)");
                            commands = input.nextInt();
                        } else if (rowPosition == 0 && columnPosition > 0) {
                            for (int i = 0; i < spaces; i++) {
                                floor[i][columnPosition] = 1;
                                rowPosition += 1;
                            }
                            currentPosition[0][1] = columnPosition;
                            currentPosition[0][0] = rowPosition;
                            System.out.printf("%d%d", rowPosition, columnPosition);
                            System.out.println("Please input 3 to go right or 4 to go left:(after space is set)");
                            commands = input.nextInt();
                        } else if (rowPosition > 0 && columnPosition <= 19) {
                            if (columnPosition - spaces >= 0) {
                                for (int i = columnPosition; i > columnPosition - spaces; i--) {
                                    floor[rowPosition][i] = 1;
                                }
                                columnPosition = columnPosition - spaces;
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                                System.out.println("Please input 3 to go right or 4 to go left:(after space is set)");
                                commands = input.nextInt();
                            } else if (rowPosition - spaces < 0) {
                                System.out.println("You have entered an impossible amount of spaces");
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                                input.nextLine();
                            } else {
                                System.out.println("Please enter a valid space digit:");
                                input.nextLine();
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                            }
                        } else if (rowPosition <= 19 && columnPosition > 0) {
                            if (rowPosition - spaces >= 0) {
                                for (int i = rowPosition; i > rowPosition - spaces; i--) {
                                    floor[i][columnPosition] = 1;
                                }
                                rowPosition = rowPosition - spaces;
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                                commands = input.nextInt();
                            } else if (rowPosition - spaces < 0) {
                                System.out.println("You have entered an impossible amount of spaces");
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                                input.nextLine();
                            } else {
                                System.out.println("Please enter a valid space digit:");
                                currentPosition[0][0] = rowPosition;
                                currentPosition[0][1] = columnPosition;
                                System.out.printf("%d%d", rowPosition, columnPosition);
                                input.nextLine();
                            }
                        }
                    }
                    else if (commands == LEFT) {
                        System.out.println("Please enter how many space left you'd like to move:");
                        try {
                            spaces = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter valid input(testcase user enters a)");
                        }
                        System.out.println("Please input 3 to go right or 4 to go left:(after space is set)");
                        commands = input.nextInt();

                    } else if (commands == DISPLAY_ARRAY) {
                        displayArray(floor);
//                        break;
                        input.nextLine();
                    } else {
                        System.out.println("Please enter a valid command,3 to go right or 4 to go left(wrong command number/no matching command digit)");
                        input.nextLine();
                    }
                }
            }

        else{
                        System.out.println("Please enter a valid number 1 - Pen up, 2 - Pen down;invalid number for commands for pend down and up");
                        input.nextLine();
        }
            }
        }


        public static void displayArray ( int[][] array){
            for (int[] ints : array) {
                for (int anInt : ints) {
                    if (anInt == 0) {
                        System.out.print(" ");
                    } else if (anInt == 1) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

}



