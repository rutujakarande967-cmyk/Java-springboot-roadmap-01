package Day_03;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.print("Enter Third number:");
        int c = sc.nextInt();

               if(a>b && a>c){
                   System.out.print("a is larger");
               }
               else if(b>a && b>c){
                   System.out.print("b is larger");
               }
               else{
                   System.out.print(" c is larger");
               }

    }
}
