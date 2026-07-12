package Day_06;

import java.util.Scanner;
public class ReturnChar {
    static char getPerformanceGrade(double marks){
        if(marks >= 75){
            return 'A';
        }else if(marks >= 60){
            return 'B';
        }else if(marks >= 40){
            return 'C';
        }else{
            return 'f';
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks:");
        double marks  = sc.nextDouble();

        char grade = getPerformanceGrade(marks);

        System.out.println("Grade: " + grade);
    }
}
