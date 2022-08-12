public class Ex7_15 {
    public static void main(String[] args) {


        if(args.length != 1){
            int[] array = new int[10];
        }
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new  int[arrayLength];
        }
        System.out.println("nl");
    }
}
