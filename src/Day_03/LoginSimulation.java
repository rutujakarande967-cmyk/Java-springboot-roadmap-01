package Day_03;
import java.util.Scanner;
public class LoginSimulation {
    public static void main(String[]args){

        String username = "admin";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username:");
        String inputUsername = sc.nextLine();

        System.out.print("Enter Password:");
        String inputPassword = sc.nextLine();

              if(username.equals(inputUsername) && password.equals(inputPassword)){
                  System.out.print("Login Successful");
              }
              else{
                  System.out.print("Invalid Credentials");
              }
    }

}
