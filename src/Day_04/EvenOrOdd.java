package Day_04;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]arga){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();

        switch(number%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
}
