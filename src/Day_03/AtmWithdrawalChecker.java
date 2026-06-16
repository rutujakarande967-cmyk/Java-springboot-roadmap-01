package Day_03;
import java.util.Scanner;
public class AtmWithdrawalChecker {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        System.out.println("Current Balance:" + balance);

        System.out.println("Enter Withdrawal Amount: " );
        int amount = sc.nextInt();

             if(amount <= balance){
                 balance = balance - amount;
                 System.out.println("Withdrawal Successful");
                 System.out.println("Remaining Balance:" + balance);
             }
             else{
                 System.out.println("Insufficient Balance");
             }

    }
}
