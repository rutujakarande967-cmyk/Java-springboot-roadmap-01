package Day_04;
import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    *Restaurant Menu*    ");

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Sandwich");
        System.out.println("4. Coffee");
        System.out.println("5. Tea");

        System.out.print("Enter the food number:");
        int foodNumber = sc.nextInt();

        switch (foodNumber) {
            case 1:
                System.out.println("Pizza - 110");
                break;
            case 2:
                System.out.println("Burger - 80");
                break;
            case 3:
                System.out.println("Sandwich - 90");
                break;
            case 4:
                System.out.println("Coffee - 70");
                break;
            case 5:
                System.out.println("Tea - 50");
                break;
            default:
                System.out.println("Invalid");



        }

    }
}
