package Day_06;
// project
import java.util.Scanner;

public class JavaUtilitySystem {


    static void displayMenu() {
        System.out.println("====================================");
        System.out.println("       JAVA UTILITY SYSTEM");
        System.out.println("====================================");
        System.out.println("1. Calculator");
        System.out.println("2. Even or Odd Checker");
        System.out.println("3. Positive or Negative Checker");
        System.out.println("4. Voting Eligibility");
        System.out.println("5. Grade Calculator");
        System.out.println("6. Multiplication Table");
        System.out.println("7. Factorial Calculator");
        System.out.println("8. Sum from 1 to N");
        System.out.println("9. Exit");
        System.out.println("====================================");
    }


    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }


    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }


    static boolean isEligible(int age) {
        return age >= 18;
    }


    static String calculateGrade(double marks) {

        if (marks >= 90)
            return "A+";
        else if (marks >= 75)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 40)
            return "C";
        else
            return "Fail";
    }


    static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    static long calculateFactorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
    static int calculateSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            displayMenu();

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("----- CALCULATOR -----");

                    System.out.print("Enter First Number: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    double b = sc.nextDouble();

                    System.out.println("Addition = " + add(a, b));
                    System.out.println("Subtraction = " + subtract(a, b));
                    System.out.println("Multiplication = " + multiply(a, b));
                    System.out.println("Division = " + divide(a, b));

                    break;

                case 2:

                    System.out.print("Enter Number: ");
                    int evenNumber = sc.nextInt();

                    if (isEven(evenNumber))
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");

                    break;

                case 3:

                    System.out.print("Enter Number: ");
                    int positiveNumber = sc.nextInt();

                    if (isPositive(positiveNumber))
                        System.out.println("Positive Number");
                    else
                        System.out.println("Negative Number");

                    break;

                case 4:

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    if (isEligible(age))
                        System.out.println("Eligible to Vote");
                    else
                        System.out.println("Not Eligible to Vote");

                    break;

                case 5:

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    System.out.println("Grade = " + calculateGrade(marks));

                    break;

                case 6:

                    System.out.print("Enter Number: ");
                    int table = sc.nextInt();

                    printTable(table);

                    break;

                case 7:

                    System.out.print("Enter Number: ");
                    int fact = sc.nextInt();

                    System.out.println("Factorial = " + calculateFactorial(fact));

                    break;

                case 8:

                    System.out.print("Enter Number: ");
                    int sum = sc.nextInt();

                    System.out.println("Sum = " + calculateSum(sum));

                    break;

                case 9:

                    System.out.println("Thank You! Visit Again.");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 9);


    }
}