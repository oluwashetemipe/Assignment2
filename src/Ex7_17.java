import java.util.Random;

public class Ex7_17 {
    private static Random rollDice = new Random();
    //Write an application to simulate the rolling of two dice.
    // The application
    //should use an object of class Random once to
    // roll the first
    // die and again to roll the second die. The
    //sum of the two values should then be calculated.
    // Each die can show an integer value from 1 to 6, so
    //the sum of the values will vary from 2 to 12, with 7
    // being the most frequent sum, and 2 and 12 the
    //least frequent. Figure 7.28 shows the 36 possible
    // combinations of the two dice. Your application
    //should roll the dice 36,000,000 times. Use a one-dimensional
    // array to tally the number of times
    //each possible sum appears.
    // Display the results in tabular format

    public static void main(String[] args) {
       int[] tallySum = new int[13];

        for (int i =0; i < 36000000; i++){
           int sum = rollDice();
           switch (sum){
               case 2:
                   ++tallySum[2];
                   break;
               case 3:
                   ++tallySum[3];
                   break;
               case 4:
                   ++tallySum[4];
                   break;
               case 5:
                   ++tallySum[5];
                   break;
               case 6:
                   ++tallySum[6];
                   break;
               case 7:
                   ++tallySum[7];
                   break;
               case 8:
                   ++tallySum[8];
                   break;
               case 9:
                   ++tallySum[9];
                   break;
               case 10:
                   ++tallySum[10];
                   break;
               case 11:
                   ++tallySum[11];
                   break;
               case 12:
                   ++tallySum[12];
                   break;
           }
        }
        for (int j= 2; j < tallySum.length; j++){
            System.out.printf("%d%n",tallySum[j]);
        }
    }
    public static int rollDice(){
        int firstDie = 1 + rollDice.nextInt(6);
        int secondDie = 1 + rollDice.nextInt(6);

        int sum = firstDie + secondDie;
        return sum;
    }
}
