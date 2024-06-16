import primeMain.Main;
import java.util.*;

public class NumberOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(Main.isPrime(i)){
                primes.add(i);
            }
        }
        for(Integer i : primes){
            System.out.print(i+" ");
        }
    }
}
