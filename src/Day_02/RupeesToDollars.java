package Day_02;


import java.util.Scanner;

    public class RupeesToDollars {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Rupees: ");
            double rupees = sc.nextDouble();

            double rate = 85.0;
            double dollars = rupees / rate;

            System.out.println("Dollars = " + dollars);


        }
    }

