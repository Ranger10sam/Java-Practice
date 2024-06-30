public class CountOddNosUsingPrefixSum {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5,6,7,8,9};
        int[][] B = { {1, 2}, {0, 5}, {1, 5} };

        int[]pSum = new int[A.length];
        pSum[0] = (A[0] %2 != 0) ? 1 : 0;
        for(int i = 1; i < A.length; i++){
            pSum[i] = pSum[i-1] + ( (A[i] %2 != 0) ? 1 : 0 );
        }

        for(int i = 0; i < B.length; i++){
            int left = B[i][0];
            int right = B[i][1];

            if(left==0){
                System.out.println("Number of Odd numbers: "+ pSum[right]);
            }else{
                System.out.println("Number of Odd numbers: "+ (pSum[right]-pSum[left-1]) );
            }
        }
    }
}
