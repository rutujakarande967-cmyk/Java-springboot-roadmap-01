package Day_06;
import java.util.Scanner;
public class BillCalculator {

    static double  calculateItemTotal(double price,int quantity){
        return price * quantity;
    }
    static double calculateFinalBill(double price, int quantity){
        double total = calculateItemTotal(price,quantity);
        return total;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Price:");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity:");
        int quantity = sc.nextInt();

        double finalBill = calculateFinalBill(price,quantity);

        System.out.println("Final Bill = " + finalBill);
    }
}
