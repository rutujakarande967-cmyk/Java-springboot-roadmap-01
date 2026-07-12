package Day_06;
import java.util.Scanner;
public class GradeCalculator {
    static String calculatorGrade(double marks){
        if(marks >= 90){
            return "A+";
        }else if(marks >= 75){
            return "A";
        }else if(marks >= 40){
            return "C";
        }else{
            return "Fail";
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks:");
        double marks = sc.nextDouble();

        String grade = calculatorGrade(marks);
        System.out.println("Grade:" + grade);
    }
}
