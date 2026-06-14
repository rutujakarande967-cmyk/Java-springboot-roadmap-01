package Day_02;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r = sc.nextDouble();
        double sum = 3.14159*r*r;
        System.out.println( "Area of circle:" + sum);

    }
}

