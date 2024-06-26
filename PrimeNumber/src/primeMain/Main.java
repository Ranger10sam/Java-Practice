package primeMain;

import java.util.*;

public class Main {

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }

}
