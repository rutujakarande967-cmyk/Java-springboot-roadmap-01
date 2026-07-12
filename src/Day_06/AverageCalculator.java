package Day_06;
import java.util.Scanner;
public class AverageCalculator {
    static double calculateAverage(double a, double b, double c){
        return a+b+c/3;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number:");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd number:");
        double c = sc.nextDouble();

        double average = calculateAverage(a,b,c);
        System.out.println("Average = " + average);
    }
}
