package Day_06;

import java.util.Scanner;
public class PersonalizedGreeting {
    static void greetUser(String name) {
        System.out.println("Welcome " + name + " Happy coding!");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        greetUser(name);

    }
}
