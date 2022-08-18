public class Ex7_14 {
    public static void main(String[] args) {
        // Write an application that calculates the product of a series
        //of integers that are passed to method product using a variable-length argument list.
        // Test your method with several calls, each with a different number of argument
    int a,b,c,d;
    a = 3;
    b = 6;
    c = 2;
    d = 5;

        System.out.println(product(d,a));
        System.out.println(product(b,c));
        System.out.println(product(a,b,c));
        System.out.println(product(a,b,c,d));
    }
    public static int product(int... numbers){
        int product = 1;
        for (int p : numbers){
            product *= p;
        }
        return product;
    }
}
