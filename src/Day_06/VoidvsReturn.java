package Day_06;
import java.util.Scanner;
public class VoidvsReturn {
    static void printAddition(int a,int b){
        System.out.println("Addition: " + (a+b));
    }
    static int calculateAddition(int a,int b){
        return a+b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        // calling void method
        printAddition(a,b);

        // calling return method
        int result = calculateAddition(a,b);

        System.out.println("Addition * 10 = " +(result * 10));
    }
}

// void = performs a task and ends cannot use that printed value in another calculation

// return = gives a value back so we use it later
// a returned value can be reused anywhere in program