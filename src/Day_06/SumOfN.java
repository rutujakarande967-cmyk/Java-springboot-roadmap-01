package Day_06;
import java.util.Scanner;
public class SumOfN {
    static int calculateSum(int number){
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int number = sc.nextInt();

        int result = calculateSum(number);

        System.out.println("Sum = " + result);
    }
}
