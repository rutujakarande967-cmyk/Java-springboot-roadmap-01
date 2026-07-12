package Day_06;
import java.util.Scanner;
public class Calculator {
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
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("================================================================================");
            System.out.println("                           CALCULATOR                                                         ");
            System.out.println("================================================================================");
            System.out.println("              ---------------MENU---------------                                ");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.print("Enter choice:");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter 1st number:");
                double a = sc.nextDouble();
                System.out.print("Enter 2nd number:");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Addition = " + add(a, b));
                        break;

                    case 2:
                        System.out.println("Subtraction = " + subtract(a, b));
                        break;

                    case 3:
                        System.out.println("Multiplication = " + multiply(a, b));
                        break;

                    case 4:
                        System.out.println("Division = " + divide(a, b));
                        break;
                }
                }else if (choice == 5) {
                    System.out.println("Thank You!");
                    break;
                } else {
                    System.out.println("Invalid Choice");
                }

            } while (choice != 5);

            }


        }


