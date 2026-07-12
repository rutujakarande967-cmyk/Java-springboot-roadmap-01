package Day_06;
import java.util.Scanner;
public class FactorialMethod {
    static long calculateFactorial(int number){
        long factorial = 1;
        for(int i = 1; i<= number; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = sc.nextInt();
        long result = calculateFactorial(number);

        System.out.println("Factorial = " + result);
    }
}
