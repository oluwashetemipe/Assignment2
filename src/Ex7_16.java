public class Ex7_16 {
    public static void main(String[] args) {
        //Write an application that uses an enhanced
        // for statement to sum the double values passed by
        // the command-line arguments. [Hint: Use the static
        //method parseDouble of class Double to convert a String
        // to a double value.
        double total = 0;
        if (args.length > 2){
            double[] array = new double[args.length];
            for (int i = 0; i < args.length; i++){
                double v = Double.parseDouble(args[i]);
                array[i] = v;
            }
            for (double num : array){
                total += num;
            }
            System.out.printf("%.2f%n",total);
        }
        else{
            System.out.println("Not enough arguments");
        }

    }
}
