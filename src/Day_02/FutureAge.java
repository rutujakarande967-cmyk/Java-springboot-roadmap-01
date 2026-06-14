package Day_02;
import java.util.Scanner;

public class FutureAge {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current age:");
        int a = sc.nextInt();
        int b = a + 10;

        System.out.println("Age after 10 years =" + b);
    }
}
