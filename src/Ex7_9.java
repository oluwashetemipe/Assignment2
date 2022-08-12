public class Ex7_9 {
    public static void main(String[] args) {
        int[][] t = new int[2][3];



        for (int row = 0; row < t.length; row++)
        {
            for (int column = 0; column < t[row].length; column++)
                System.out.printf("%d ", t[row][column]);

            System.out.println();
        }
        System.out.printf("%d",t[1][0]);
        System.out.printf("%d",t[1][1]);
        System.out.printf("%d",t[1][2]);
        System.out.printf("%d",t[0][2]);
        System.out.printf("%d",t[1][2]);
        t[0][1] = 0;
    }

}
