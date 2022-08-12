import java.util.Arrays;
import java.util.Scanner;

public class Ex7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int distinctCount = 0;
        int inputCount = 0;
        while (inputCount < 5){
            System.out.println("Please enter a number between 10 and 100: ");
            int number = input.nextInt();
            if (number >= 10 && number <= 100) {
               int location = Arrays.binarySearch(array,number);
               if (location >= 0  ){
                   System.out.println("found");
                   break;
               }
               else {
                   System.out.println("not found");
                   array[inputCount] = number;
                   System.out.printf("%d%n",number);
                   distinctCount++;
                   inputCount++;
//                   System.out.println(distinctCount);
               }
            }
        }
//        if (distinctCount < 5){
//            int[] distinctArray = new int[distinctCount];
//            System.arraycopy(array,0,distinctArray,0,distinctCount);
//            displayArray(distinctArray);
//        }
//        else
            displayArray(array);
    }
    public static void displayArray(int[] array){
        for (int value: array){
            System.out.printf("%d ", value);
        }
    }
}
