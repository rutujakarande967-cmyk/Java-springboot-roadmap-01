package Day_04;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SHOW THE GRADES");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("F");

        System.out.print("Enter the grade:");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Average");
                break;
            case 'E':
                System.out.println("Fail");
                break;

        }
    }
}
