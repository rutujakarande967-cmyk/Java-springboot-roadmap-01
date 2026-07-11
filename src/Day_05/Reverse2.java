package Day_05;

import java.util.Scanner;

public class Reverse2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;

        while (number != 0) { // Keep repeating the code inside the loop as long as number is not equal to 0
            int digit = number % 10;          // Get last digit
            reverse = reverse * 10 + digit;   // Build reversed number
            number = number / 10;             // Remove last digit
        }

        System.out.println("Reversed Number = " + reverse);


    }
}
