package Day_02;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int length = sc.nextInt();
        System.out.print("Enter the width:");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area of Rectangle:" + area);
    }
}
