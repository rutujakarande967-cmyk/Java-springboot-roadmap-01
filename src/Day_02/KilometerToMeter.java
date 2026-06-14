package Day_02;
import java.util.Scanner;
public class KilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometers:");
        int kilometers = sc.nextInt();
        int meters = kilometers * 1000;
        System.out.println("Convert kilometers into meters:" + meters);
    }
}