public class CountEvenNumbersUsingPrefixSum {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[][] B = new int[][]{ {1, 2}, {0, 4}, {2, 5} };
        int count=0;
        int[] pSum = new int[A.length];
        pSum[0] = (A[0]%2 == 0) ? 1 : 0;
        for(int i=1;i<A.length;i++){        //if we find any even elements, then adding 1 at that position in the prefix sum array
            pSum[i] = pSum[i-1] + ( (A[i]%2==0) ? 1 : 0 );
        }

        for(int i=0; i<B.length;i++){
            int left = B[i][0];
            int right = B[i][1];
            if (left == 0) {
                System.out.println("Number of even numbers is: " + pSum[right]);
            }else{
                System.out.println("Number of even numbers is: " + (pSum[right]-pSum[left-1]) );
            }
        }
    }
}
