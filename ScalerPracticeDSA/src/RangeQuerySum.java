public class RangeQuerySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7 ,8 ,9};
        int N = arr.length;
        int[][] queries = { {0, 2}, {2, 4}, {3, 4}, {0, 5} };
        rangeQuerySum(arr, N, queries);
    }
    public static void rangeQuerySum(int[] arr, int n, int[][] queries) {
        int[] pSumArray = new int[n];
        pSumArray[0] = arr[0];
        for(int i=1; i<n; i++){
            pSumArray[i] = pSumArray[i-1] + arr[i];
        }
        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                System.out.print( pSumArray[right] + " " );
            }else {
                System.out.print((pSumArray[right] - pSumArray[left - 1]) + " ");
            }
        }
    }
}
