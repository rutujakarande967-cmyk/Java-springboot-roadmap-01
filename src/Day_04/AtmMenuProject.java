package Day_04;
import java.util.Scanner;
public class AtmMenuProject {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("`     * ATN MACHINE *     ");
           int balance = 10000;

        System.out.println("ATM MENU:  ");

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter the choice:");
        int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.print("Available Balance:" + balance);
                        break;
                    case 2:
                        System.out.print("Enter Deposit amount:");
                        int deposit = sc.nextInt();
                        System.out.println("Deposit Successful");
                        System.out.println("Updated Balance:" + balance);
                        break;
                    case 3:
                        System.out.print("Enter Withdrawal amount:");
                        int withdraw = sc.nextInt();
                        if(withdraw <= balance){
                            balance = balance - withdraw;
                            System.out.print("Remaining Balance:" + balance);
                        }else{
                            System.out.print("Insufficient Balance");
                        }
                        break;
                    case 4:
                        System.out.print("Exit and Thank you for using the ATM");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }





    }

}
