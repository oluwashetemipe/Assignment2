
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int distinctCount = 1;
        int inputCount = 0;
        do {
            System.out.println("Please enter a number between 10 and 100: ");
            try {
                int number = input.nextInt();
                if (number >= 10 && number <= 100) {
                    if (number == array[0]) {

                    } else if (number == array[1]) {

                    } else if (number == array[2]) {

                    } else if (number == array[3]) {

                    } else if (number == array[4]) {

                    } else {
                        array[distinctCount] = number;
                        System.out.printf("%d%n",array[distinctCount]);
                        distinctCount++;
                        inputCount++;
                    }
                } else {
                    System.out.println("Number out of range,please try again");
                    input.nextLine();
                }
                //
            }
            catch (InputMismatchException inputMismatchException){
//                System.err.printf("%nException: %s%n", inputMismatchException);
                System.out.println("Please enter a valid number");
                input.nextLine();
            }

        }while (inputCount < 5);
        displayArray(distinctCount,array);
        }

//
//               for (int i = 0; i < inputCount; i++) {
//                   if (array[i] == number) {
//                       System.out.printf("%d already exists",number);
//                   }
//
//                   else if (array[i] != number){
//                       array[inputCount - 1] = number;
//                   }
//               }
//                System.out.printf("%d%n",number);
//                distinctCount++;
//               }
//               inputCount++;
//        }
////        if (distinctCount < 5){
////            int[] distinctArray = new int[distinctCount];
////            System.arraycopy(array,0,distinctArray,0,distinctCount);
////            displayArray(distinctArray);
////        }
////        else


    public static void displayArray(int limit,int[] array){
        for (int v = 0; v < limit; v++){
            System.out.printf("%d ", array[v]);
        }
    }
}
