import java.util.Scanner;

public class Ex7_10 {
    public static void main(String[] args) {
        //input checks
        int[] range = new int[11];

            Scanner input = new Scanner(System.in);
            try{
                for (int i = 0; i < 10; i ++){
                    System.out.println("Please enter gross sales for the week: ");
                    int grossSale = input.nextInt();
                    int salary = calculateSalary(grossSale);
                    if (salary >= 200 && salary < 300) {
                        range[2] += 1;
                    } else if (salary >= 300 && salary < 400) {
                        range[3] += 1;
                    } else if (salary >= 400 && salary < 500) {
                        range[4] += 1;
                    } else if (salary >= 500 && salary < 599) {
                        range[5] += 1;
                    } else if (salary >= 600 && salary < 699) {
                        range[6] += 1;
                    } else if (salary >= 700 && salary < 799) {
                        range[7] += 1;
                    } else if (salary >= 800 && salary < 900) {
                        range[8] += 1;
                    } else if (salary >= 900 && salary < 1000) {
                        range[9] += 1;
                    } else if (salary >= 1000) {
                        range[10] += 1;
                    }
                }
            }
            catch (Exception e){
                System.out.println("Salary not in range");
            }

        System.out.printf("%s%8s%n", "Range", "Value");
        for (int i = 2; i < range.length; i++){
            if (i == 10){
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

