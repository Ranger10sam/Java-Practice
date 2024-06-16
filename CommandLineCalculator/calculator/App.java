package calculator;
import java.util.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        String choice = "y";
        while(!Objects.equals(choice, "n")) {
            System.out.println("What operation you would like to do?");
            System.out.println("For Addition - Press +");
            System.out.println("Subtraction - Press -");
            System.out.println("Multiplication - Press *");
            System.out.println("Division - Press /");

            String input = sc.nextLine();


            if(Objects.equals(input, "+")){
                System.out.println("Enter the first number");
                long a = sc.nextLong();
                System.out.println("Enter the second number");
                long b = sc.nextLong();
                System.out.println("Output -> " + op.Addition(a,b));
                op.Addition(a,b);
            }else if(Objects.equals(input, "-")){
                System.out.println("Enter the first number");
                long a = sc.nextLong();
                System.out.println("Enter the second number");
                long b = sc.nextLong();
                System.out.println("Output -> " + op.Subtraction(a,b));
                op.Subtraction(a,b);
            }else if(Objects.equals(input, "*")){
                System.out.println("Enter the first number");
                long a = sc.nextLong();
                System.out.println("Enter the second number");
                long b = sc.nextLong();
                System.out.println("Output -> " + op.Multiplication(a,b));
                op.Multiplication(a,b);
            }else if(Objects.equals(input, "/")){
                System.out.println("Enter the first number");
                long a = sc.nextLong();
                System.out.println("Enter the second number");
                long b = sc.nextLong();
                System.out.println("Output -> " + op.Division(a,b));
            }else{
                System.out.println("Please enter a valid input");
            }
            System.out.println("Do you wish to continue? (y/n)");
            choice = sc.nextLine();
        }

    }

}
