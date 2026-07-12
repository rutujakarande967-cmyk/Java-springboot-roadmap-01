package Day_06;
import java.util.Scanner;


public class NumberAnalyzer {
    static boolean isEven(int number){
        return number % 2 == 0;
    }
    static boolean isPositive(int number){
        return number > 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Even: " + isEven(number));
        System.out.println("Positive: " + isPositive(number));
    }
}
