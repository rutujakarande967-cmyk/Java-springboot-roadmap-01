package Day_03;
import java.util.Scanner;
public class AssignGrade {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Marks:");
        int marks = sc.nextInt();
        System.out.print("Grade based on the marks:");

             if(marks >= 90 && marks <= 100){
                 System.out.println("A+");
             }
               else if(marks >=75 && marks <= 89){
                   System.out.println("A");
             }
               else if(marks >=60 && marks <= 74){
                   System.out.println("B");
             }
               else if(marks >=40 && marks <= 59 ){
                   System.out.println("C");
             }
               else{
                   System.out.println("Fail");
             }
    }
}

