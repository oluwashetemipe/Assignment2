import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7_19 {
    public static void main(String[] args) {
        boolean[] seats = new boolean[11];
        int firstClassCount = 1;
        int secondClass = 6;
        int seatCount = 1;
        Scanner input = new Scanner(System.in);
            while (seatCount <= 10) {
                System.out.println("Please enter 1 for first class");
                System.out.println("Please enter 2 for economy class");
                try {
                    int classInput = input.nextInt();
                    if (classInput == 1) {
                        if (!seats[firstClassCount] && firstClassCount <= 5) {
                            seats[firstClassCount] = true;
                            System.out.printf("Boarding pass: %d, Welcome to first class", firstClassCount);
                            firstClassCount++;
                            seatCount++;
                        } else if (firstClassCount > 5) {
                            System.out.println("First class section is full, would you like to get an economy ticket?Yes/No");
                            String response = input.next();
                            if (response.equalsIgnoreCase("yes")) {
                                if (secondClass < 11) {
                                    seats[secondClass] = true;
                                    System.out.printf("Boarding pass: %d, Welcome to second class", secondClass);
                                    secondClass++;
                                    seatCount++;
                                } else
                                    System.out.println("No available seat.Next flight leaves in 3 hours");
                            } else if (response.equalsIgnoreCase("no")) {
                                System.out.println("Next flight leaves in 3 hours");
                            } else {
                                System.out.println("Please input yes or no");
                                input.nextLine();
                            }

                        }
                    } else if (classInput == 2) {
                        if (!seats[secondClass] && secondClass >= 6) {
                            seats[secondClass] = true;
                            System.out.printf("Boarding pass: %d, Welcome to second class", secondClass);
                            secondClass++;
                            seatCount++;
                        }
                        if (secondClass > 10) {
                            System.out.println("Second class section is full, would you like to get an First Class ticket?");
                            String response = input.next();
                            if (response.equalsIgnoreCase("yes")) {
                                if (firstClassCount < 6) {
                                    seats[firstClassCount] = true;
                                    System.out.printf("Boarding pass: %d, Welcome to first class", firstClassCount);
                                    firstClassCount++;
                                    seatCount++;
                                } else
                                    System.out.println("No available seat.Next flight leaves in 3 hours");
                            } else if (response.equalsIgnoreCase("no")) {
                                System.out.println("Next flight leaves in 3 hours%n");
                            } else {
                                System.out.println("Input not in range,Please input yes or no");
                            }
                        }
                    } else
                        System.out.println("Input not in range");
                }catch (InputMismatchException mismatchException){
                    System.out.println("You entered a wrong input,please try again:");
                    input.nextLine();
                }

            }
        }

    }


