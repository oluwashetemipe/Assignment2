import java.util.Scanner;

public class Ex7_10 {
    public static void main(String[] args) {
        int[] range = new int[10];
        for (int i = 0; i< range.length; i++) {
            System.out.println("Please enter gross sales for the week: ");
            Scanner input = new Scanner(System.in);
            int grossSale = input.nextInt();
            int salary = calculateSalary(grossSale);
            try{
                if (salary >= 200 && salary < 300) {
                    range[1] += 1;
                } else if (salary >= 300 && salary < 400) {
                    range[2] += 1;
                } else if (salary >= 400 && salary < 500) {
                    range[3] += 1;
                } else if (salary >= 500 && salary < 599) {
                    range[4] += 1;
                } else if (salary >= 600 && salary < 699) {
                    range[5] += 1;
                } else if (salary >= 700 && salary < 799) {
                    range[6] += 1;
                } else if (salary >= 800 && salary < 900) {
                    range[7] += 1;
                } else if (salary >= 900 && salary < 1000) {
                    range[8] += 1;
                } else if (salary >= 1000) {
                    range[9] += 1;
                }
            }
            catch (Exception e){
                System.out.println("Salary not in range");
            }
        }
        System.out.printf("%s%8s%n", "Range", "Value");
        for (int i = 1; i < range.length; i++){
            if (i == 9){
                System.out.printf("%2d$ and over: ",1000 );
            }
            else {
                System.out.printf("%2d-%2d: ",i * 100, i * 100 + 99);
            }
            System.out.printf("%d",range[i]);
            System.out.println();
        }
    }
    public static int calculateSalary(int grossSale){
        int salary = 0;
        salary = (int) (200 + (0.09 * grossSale));
        return salary;
    }
}
