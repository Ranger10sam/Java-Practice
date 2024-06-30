import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};               //1 2 3 4 5
        int[][] query = new int[][]{ {0, 3}, {1, 2}, {1, 4}};

        int[] pSum = new int[arr.length];                   //1 3 6 10 15
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] = pSum[i-1] + arr[i];
        }

        for(int i=0; i<query.length; i++) {
            int left = query[i][0];
            int right = query[i][1];

            if(left == 0){
                System.out.print("For : "+left + ", " + right);
                System.out.println(" : "+pSum[right]);
            }else{
                System.out.print("For : "+left + ", " + right);
                System.out.println(" : "+(pSum[right]-pSum[left-1]));
            }
        }
    }
}
