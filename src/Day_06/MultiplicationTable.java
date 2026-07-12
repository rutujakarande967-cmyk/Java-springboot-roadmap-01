package Day_06;
import java.util.Scanner;
public class MultiplicationTable {
    static void printTable(int number){
        for(int i=1; i<= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int number = sc.nextInt();

        printTable(number);
    }
}
