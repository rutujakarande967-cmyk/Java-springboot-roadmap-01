package Day_06;
import java.util.Scanner;
public class AdditionMethod {
    static int add(int a,int b){
        return a + b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();

        int result = add(a,b);

        System.out.println("Addition: "  + result);

    }
}

// Que: why are we storing the returned result in a variable
         // int result = add(a,b);  ?

// ans: add(A,b) returns the sum
// we store that returned value in result
// then we can print it or use it later

  // as like
// sout(result);
// sout(result * 10 );

