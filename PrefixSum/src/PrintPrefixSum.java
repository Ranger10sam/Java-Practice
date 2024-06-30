public class PrintPrefixSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }

        for(int p: pSum){
            System.out.print(p+" ");
        }
    }
}
