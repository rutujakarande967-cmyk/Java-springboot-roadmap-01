package Day_04;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of circle");
        System.out.println("Area of rectangle");
        System.out.println("Kilometer to meter");
        System.out.println("Average of three numbers");
        System.out.println("Exit");

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the radius:");
                int r = sc.nextInt();
                double area = 3.141*r*r;
                System.out.print("Area of circle:" + area);
                break;
            case 2:
                System.out.print("Enter length:");
                double length = sc.nextDouble();
                System.out.print("Enter Weidth:");
                double weidth = sc.nextDouble();
                double area1 = length * weidth;
                System.out.print("Area of rectangle:" + area1);
                break;
            case 3:
                System.out.print("Enter distance in kilometer: ");
                double kilometer = sc.nextDouble();
                double meter = kilometer * 1000;
                System.out.println("Distance in meter" + meter);
                break;
            case 4:
                System.out.print("Enter 1st number:");
                int num1 = sc.nextInt();

                System.out.print("Enter 2nd number:");
                int num2 = sc.nextInt();

                System.out.print("Enter 3rd number:");
                int num3 = sc.nextInt();

                double average = (num1 + num2 + num3)/3;
                System.out.print("Average:" + average);
                break;
            case 5:
                System.out.println("Thank you");
        }
    }
}


