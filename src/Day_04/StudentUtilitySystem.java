package Day_04;
import java.util.Scanner;
public class StudentUtilitySystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check pass or fail");
        System.out.println("2. Calculate grade");
        System.out.println("3. Voting Eligibility");
        System.out.println("4. Exit");

        System.out.print("Enter the choice:");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the Marks:");
                int marks = sc.nextInt();
                if(marks >= 40){
                    System.out.println("Student passed");
                }else{
                    System.out.println("Student failed");
                }
                break;
            case 2:
                System.out.print("Enter the percentage:");
                int percentage = sc.nextInt();
                if(percentage == 90 - 100){
                    System.out.println("A+");
                }else if(percentage == 80-89) {
                    System.out.println("A");
                }else if(percentage == 60-79){
                    System.out.println("B");
                }else if(percentage == 50 - 59){
                    System.out.println("C");
                }else{
                    System.out.println("F");
                }
                break;
            case 3:
                System.out.print("Enter the age:");
                int age = sc.nextInt();
                if(age >= 18){
                    System.out.println("Eligible to vote");
                }else{
                    System.out.println("Not eligible to vote");
                }
                break;
            case 4:
                System.out.println("Thank You");
                break;
        }
    }
}
