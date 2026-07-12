package Day_06;
import java.util.Scanner;
public class VotingEligibility {
    static boolean isEligible(int age){
        return age >= 18;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:");
        int age = sc.nextInt();

        boolean eligible = isEligible(age);
        System.out.println("Eligible:" + eligible);


    }
}
