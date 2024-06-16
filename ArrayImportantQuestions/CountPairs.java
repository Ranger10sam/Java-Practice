import java.sql.SQLOutput;

public class CountPairs {
    public static void main(String[] args) {
        int n = 8, count=0;

        int[] arr = {5, 3, 2, 3, 6};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++ ){
                if (arr[i]+arr[j]==n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
