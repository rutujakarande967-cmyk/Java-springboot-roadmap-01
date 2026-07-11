package Day_05;
// ASSIGNMENT 2
import java.util.Scanner;
public class StudentReportGenerator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name:");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number:");
        int rollNo = sc.nextInt();

        int total = 0;
        for(int i=1; i<=5; i++){
            System.out.println("Enter marks of subject" + i+ ":");
            int marks = sc.nextInt();
            total = total + marks;
        }
        double average = total/5.0;

         String grade;
         if(average>=90){
             grade = "A+";
         }else if(average >= 80){
             grade = "A";
         }else if(average>=70){
             grade = "B";
         }else if(average>=60){
             grade = "C";
         }else if(average>=40){
             grade = "D";
         }else{
             grade = "F";
         }
        String result;
          if (average>=40){
              result = "Pass";
          }else{
              result = "Fail";
          }
        System.out.println("========STUDENT REPORT GENERATOR===========");
        System.out.println("Student Name:" + name);
        System.out.println("Roll Number:" + rollNo);
        System.out.println("Total Marks:" + total);
        System.out.println("Average:" + average);
        System.out.println("Grade:" + grade);
        System.out.println("Result:" + result);
    }
}
