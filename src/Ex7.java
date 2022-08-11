public class Ex7 {
    public static void main(String[] args) {
        //7.11 .a)
       int[] counts = new int[10];

       for (int i = 0; i < counts.length; i++){
           counts[i] = 0;
           System.out.printf("%d",counts[i]);
       }
        System.out.println();
    //7.11 .b)
       int[] bonus = new int[15];

       for (int i = 0; i < bonus.length; i++){
           bonus[i] = 1;
           System.out.printf("%d",bonus[i]);
       }
        System.out.println();
    //7.11 .c)
       int[] bestScores =new int[5];
        for (int i = 0; i < bestScores.length; i++){
            System.out.printf("%2d",bestScores[i]);
        }
        System.out.println();
        for (int scores : bestScores){
            System.out.print(scores);
        }
        System.out.println();
    }
}
