package Day_05;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[]args){
                Scanner sc = new Scanner(System.in);

                // Correct number to guess
                int correctNumber = 7;

                // User's guess
                int guess;

                // Ask for the first guess
                System.out.print("Guess the number (1-10): ");
                guess = sc.nextInt();

                // Keep asking until the guess is correct
                while (guess != correctNumber) {

                    System.out.println("Wrong! Try again.");

                    System.out.print("Guess the number (1-10): ");
                    guess = sc.nextInt();
                }

                // This runs only when the user guesses correctly
                System.out.println("Congratulations! You guessed the correct number.");


            }
        }

