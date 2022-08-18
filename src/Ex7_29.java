import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7_29 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
//        do {
//            System.out.println("Please enter a number:");
//            try {
//                n = input.nextInt();
//                calFib(n);
////                calFibDouble(n);
//                continueLoop = false;
//            } catch (InputMismatchException inputMismatchException) {
//                System.out.println("Invalid input");
//                input.nextLine();
//            }
//        }while (continueLoop);
        calFibLong(5000);
    }
    public static void calFib(int input){
        int fibValue;
        int precedingTermOne = 0;
        int precedingTermTwo = 1;
        for (int i = 2; i <= input;i++){
            fibValue = precedingTermOne + precedingTermTwo;
            if (i == input){
                System.out.printf("F%d:%d%n", i, fibValue);
            }
            precedingTermOne = precedingTermTwo;
            precedingTermTwo = fibValue;
        }
    }
    public static void calFibLong(int input){
        long fibValue;
        long precedingTermOne = 0;
        long precedingTermTwo = 1;
        for (int i = 2; i <= input;i++){
            fibValue = precedingTermOne + precedingTermTwo;
            if (i == input){
            System.out.printf("F%d:%d%n", i, fibValue);
            }
            precedingTermOne = precedingTermTwo;
            precedingTermTwo = fibValue;
        }
    }
    public static void calFibDouble(int input){
        double fibValue;
        double precedingTermOne = 0;
        double precedingTermTwo = 1;
        for (int i = 2; i <= input;i++){
            fibValue = precedingTermOne + precedingTermTwo;
            if (i == input){
                System.out.printf("F%d:%.2f%n", i, fibValue);
            }
            precedingTermOne = precedingTermTwo;
            precedingTermTwo = fibValue;
        }
    }
}
