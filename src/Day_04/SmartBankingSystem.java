package Day_04;
import java.util.Scanner;
public class SmartBankingSystem {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int currentBalance = 10000;
        System.out.println("====== WELCOME TO ABC BANK ======");
        System.out.println("1 Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Simple interest calculator");
        System.out.println("5.Account details");
        System.out.println("Exit");

        System.out.print("Enter Account Holder Name:");
        String accountHolderName = sc.next();

        System.out.print("Enter Account Number:");
        long accountNumber = sc.nextLong();

        System.out.print("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Available Balance:" + currentBalance);
                break;
            case 2:
                System.out.print("Enter Deposit amount:");
                int deposit = sc.nextInt();
                System.out.println("Deposit Successful");
                System.out.println("Updated Balance:" + currentBalance);
                break;
            case 3:
                System.out.print("Enter Withdrawal amount:");
                int withdraw = sc.nextInt();
                if (withdraw <= currentBalance) {
                    currentBalance = currentBalance - withdraw;
                    System.out.print("Remaining Balance:" + currentBalance);
                } else {
                    System.out.print("Insufficient Balance");
                }
                break;
            case 4:


        }

    }}