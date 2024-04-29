package HelloWorld;
import java.util.*;

public class helloWorld {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a>0){
            System.out.println("Hello World");
        }else{
            System.out.println("Not Hello World");
        }
    }
}