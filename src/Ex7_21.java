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
        int commands = 0;
        int[][] move = new int[1][1];

        int[][] currentPosition= new int[1][2];
        int rowPosition = currentPosition[0][0];
        int columnPosition = currentPosition[0][1];
//        int[][] newPosition = {{0,0}};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a command: 1 - Pen up, 2 - Pen down");
        while (input.hasNext()) {
            commands = input.nextInt();
            if (commands == PEN_UP) {
                System.out.println("Pen up, your turtle would move freely without traces:");

            } else if (commands == PEN_DOWN) {
                System.out.println("Pen down, your turtle would move with traces emerging in shapes,please input 3 to go right or 4 to go left::");
                try {
                    commands = input.nextInt();
                    while (commands != END) {
                            if (commands == RIGHT) {
                                System.out.println("Please enter how many spaces right you'd like to move:");
                                try {
                                    int spaces = input.nextInt();
                                    if (rowPosition > 0 && columnPosition > 0) {
                                        if (columnPosition - spaces >= 0) {
                                            for (int i = columnPosition; i > columnPosition - spaces; i--) {
                                                floor[rowPosition][i] = 1;
                                                columnPosition -= 1;
                                            }
                                            currentPosition[0][1] = columnPosition;
                                            System.out.printf("%d%d", rowPosition, columnPosition);
//                                            System.out.println("print the board");
                                        }
                                        else if (columnPosition - spaces < 0) {
                                            System.out.println("You have entered an impossible amount of spaces");
                                            System.out.printf("%d%d", rowPosition, columnPosition);
//                                            System.out.println("print the board");
                                        }
                                    }
                                    else if (rowPosition == 0 && columnPosition == 0) {
                                        for (int i = 0; i < spaces; i++) {
                                            floor[rowPosition][i] = 1;
                                            columnPosition += 1;
                                        }
                                        currentPosition[0][1] = columnPosition;
                                        System.out.printf("%d%d", rowPosition, columnPosition);
//                                        System.out.println("print the board");
                                    } else if (rowPosition == 0 && columnPosition > 0) {
                                        for (int i = 0; i < spaces; i++) {
                                            floor[i][columnPosition] = 1;
                                            rowPosition += 1;
                                        }
                                        currentPosition[0][0] = rowPosition;
                                        System.out.printf("%d%d", rowPosition, columnPosition);
//                                        System.out.println("print the board");
                                    } else if (rowPosition > 0 && columnPosition == 0) {
                                        if (rowPosition - spaces >= 0) {
                                            for (int i = rowPosition; i > rowPosition - spaces; i--) {
                                                floor[i][columnPosition] = 1;
                                                rowPosition -= 1;
                                            }
                                            currentPosition[0][0] = rowPosition;
                                            System.out.printf("%d%d", rowPosition, columnPosition);
//                                            System.out.println("print the board");
                                        }
                                    } else {
                                        System.out.println("Please enter a valid space digit:");
                                        input.nextLine();
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input,you can only go right less than 20 spaces");
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                                    System.out.println("Index out of bounds");
                                }
                                System.out.println("Please input 3 to go right or 4 to go left:");
                                commands= input.nextInt();

                            } else if (commands == LEFT) {
                                System.out.println("Please enter how many space left you'd like to move:");
                                try {
                                    int spaces = input.nextInt();
                                    if (rowPosition == 0 && columnPosition == 0) {
                                        for (int i = 0; i < spaces; i++) {
                                            floor[i][columnPosition] = 1;
                                            rowPosition += 1;
                                        }
                                        currentPosition[0][0] = rowPosition;
                                        System.out.printf("%d%d", rowPosition, columnPosition);
//                                        System.out.println("print the board");
                                    }
                                    else if (rowPosition > 0 && columnPosition == 0) {
                                        for (int i = 0; i < spaces; i++) {
                                            floor[rowPosition][i] = 1;
                                            columnPosition += 1;
                                        }
                                        currentPosition[0][1] = columnPosition;
                                        System.out.printf("%d%d", rowPosition, columnPosition);
//                                        System.out.println("print the board");
                                    }
                                    else if (rowPosition > 0 && columnPosition > 0) {
                                        if (rowPosition - spaces >= 0) {
                                            for (int i = rowPosition; i > rowPosition - spaces; i--) {
                                                floor[i][columnPosition] = 1;
                                                rowPosition -= 1;
                                            }
                                            currentPosition[0][0] = rowPosition;
                                            System.out.printf("%d%d", rowPosition, columnPosition);
//                                            System.out.println("print the board");
                                        } else if (rowPosition - spaces <= 0) {
                                            System.out.println("You have entered an impossible amount of spaces");
                                            System.out.printf("%d%d", rowPosition, columnPosition);
//                                            System.out.println("print the board");
                                        }
                                        else {
                                            System.out.println("Please enter a valid space digit:");
                                            input.nextLine();
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input,you can only go right less than 20 spaces");
                                    input.nextLine();
                                }
                                System.out.println("Please input 3 to go right or 4 to go left:");
                                commands = input.nextInt();
                            } else if (commands == DISPLAY_ARRAY) {
                                displayArray(floor);
                                break;
                            }
                            else{
                                System.out.println("Please enter a valid input");
                                input.nextLine();
                            }

                    }
                }catch(InputMismatchException inputMismatchException){
                    System.out.println("Please enter a valid command, first try block");
                    input.nextLine();
                }

            }
        }
    }
    public static void displayArray(int[][] array){
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
