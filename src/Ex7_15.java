public class Ex7_15 {
    public static void main(String[] args) {


        if(Integer.parseInt(args[0]) <= 0){
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++){
                array[i] = Integer.parseInt(args[i]);
                System.out.printf("%d",array[i]);
            }
        }
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            for (int i = 0; i < array.length; i++){
                array[i] = Integer.parseInt(args[i]);
                System.out.printf("%d",array[i]);
            }
        }

    }
}
