package Day_04;

import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1:");
        int a = sc.nextInt();
        System.out.print("Enter number 2:");
        int b = sc.nextInt();

        System.out.println("      *SHOW THE MENU*      ");

        System.out.println("Choose an operation:");

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Your Choice:");
        int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println(a+b);
            break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;


                default:
                    System.out.println("Invalid choice");




        }


    }
}
