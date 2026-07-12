package Day_06;


import java.util.Scanner;
public class SmartBankingProject{
    static void displayMenu() {
        System.out.println("========================================");
        System.out.println("          WELCOME TO SMART BANK");
        System.out.println("========================================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Calculate Simple Interest");
        System.out.println("5. Account Details");
        System.out.println("6. Transaction Summary");
        System.out.println("7. Exit");
        System.out.println("========================================");
    }


    static void checkBalance(double balance) {
        System.out.println("Current Balance : ₹" + balance);
    }


    static double deposit(double balance, double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }

        return balance;
    }


    static double withdraw(double balance, double amount) {

        if (amount <= balance && amount > 0) {
            balance = balance - amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount.");
        }

        return balance;
    }


    static double calculateInterest(double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }

    // Show Account Details
    static void showAccountDetails(String name, int accountNumber, double balance) {

        System.out.println("\n------ ACCOUNT DETAILS ------");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


    static void showTransactionSummary(double totalDeposit,
                                       double totalWithdrawal,
                                       double balance) {

        System.out.println("------ TRANSACTION SUMMARY ------");
        System.out.println("Total Deposit     : ₹" + totalDeposit);
        System.out.println("Total Withdrawal  : ₹" + totalWithdrawal);
        System.out.println("Current Balance   : ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String accountHolder = "Rutya Karande";
        int accountNumber = 10001;
        double balance = 25000;

        double totalDeposit = 0;
        double totalWithdrawal = 0;

        int choice;

        do {

            displayMenu();

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    checkBalance(balance);
                    break;

                case 2:

                    System.out.print("Enter Deposit Amount: ₹");
                    double depositAmount = sc.nextDouble();

                    balance = deposit(balance, depositAmount);

                    if (depositAmount > 0) {
                        totalDeposit += depositAmount;
                    }

                    break;

                case 3:

                    System.out.print("Enter Withdrawal Amount: ₹");
                    double withdrawAmount = sc.nextDouble();

                    double oldBalance = balance;

                    balance = withdraw(balance, withdrawAmount);

                    if (balance != oldBalance) {
                        totalWithdrawal += withdrawAmount;
                    }

                    break;

                case 4:

                    System.out.print("Enter Rate (%): ");
                    double rate = sc.nextDouble();

                    System.out.print("Enter Time (Years): ");
                    double time = sc.nextDouble();

                    double interest = calculateInterest(balance, rate, time);

                    System.out.println("Simple Interest = ₹" + interest);

                    break;

                case 5:

                    showAccountDetails(accountHolder, accountNumber, balance);

                    break;

                case 6:

                    showTransactionSummary(totalDeposit,
                            totalWithdrawal,
                            balance);

                    break;

                case 7:

                    System.out.println("\nThank You for Banking with Us!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 7);


    }
}