package Day_05;
import java.util.Scanner;
public class SmartBankingProject {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // taking account details

        System.out.print("Enter Account Holder Name:");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Account Number:");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance:");
        double balance = sc.nextDouble();

        double totalDeposit = 0;
        double totalWithdraw = 0;
        int choice;

       do {

           System.out.println("============= WELCOME TO ABC BANK =============");
           System.out.println("1.Check Balance");
           System.out.println("2. Deposit Money");
           System.out.println("3.Withdraw Money");
           System.out.println("4.Calculate Simple Interest");
           System.out.println("5.Account Details");
           System.out.println("6.Transactiom Summary");
           System.out.println("7.Exit");

           System.out.print("Enter the choice:");
            choice = sc.nextInt();

           switch (choice) {
               case 1:
                   System.out.println("Current Balance:" + balance);
                   break;
               case 2:
                   System.out.println("Enter Deposit Amount");
                   double deposit = sc.nextDouble();
                   balance = balance + deposit;
                   totalDeposit = totalDeposit + deposit;
                   System.out.println("Amount Deposited Successfully");
                   break;
               case 3:
                   System.out.print("Enter Withdraw Amount");
                   double withdraw = sc.nextDouble();
                   if (withdraw <= balance) {
                       balance = balance - withdraw;
                       totalWithdraw = totalWithdraw + withdraw;
                       System.out.println("Amount Withdrawm Succwssfully");
                   } else {
                       System.out.println("Insufficient Balance");
                   }
                   break;
               case 4:
                   System.out.print("Enter Principal:");
                   double principal = sc.nextDouble();

                   System.out.print("Enter Rate:");
                   double rate = sc.nextDouble();

                   System.out.print("Enter Time:");
                   double time = sc.nextDouble();

                   double interest = (principal * rate * time) / 100;
                   System.out.println("Simple Interest: " + interest);
                   break;
               case 5:
                   System.out.println("======= Account Details =========");
                   System.out.println("Account Holder:" + accountHolder);
                   System.out.println("Account Number:" + accountNumber);
                   System.out.println("Current Balance:" + balance);
                   break;
               case 6:
                   System.out.println("=========== Transaction Summary ==========");
                   System.out.println("Total Deposits:" + totalDeposit);
                   System.out.println("Total Withdrawls:" + totalWithdraw);
                   System.out.println("Current Balance:" + balance);
                   break;
               case 7:
                   System.out.println("Thank you for using ABC Bank!");
                   break;
               default:
                   System.out.println("Invalid choice");
           }
       }while(choice != 7);

        }
    }
