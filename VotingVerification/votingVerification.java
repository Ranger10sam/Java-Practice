package VotingVerification;

import java.util.*;

public class votingVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();

        System.out.println("Enter your age: ");


        if(a>=18){
            System.out.println("Eligible!!!");
        }else{
            System.out.println("Not Eligible!!!");
        }

        sc.close();
    }
}
