public class EvenNumbersInARange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[][] queries = { {0, 4}, {0, 6}, {1, 9} };

        evenNumbersInARange(arr, queries);
    }
    public static void evenNumbersInARange(int[] arr, int[][] queries) {
        int[] pEvenArray = new int[arr.length];
        int[] pOddArray = new int[arr.length];
        pEvenArray[0] = (arr[0]%2==0) ? 1 : 0;
        pOddArray[0] = (arr[0]%2!=0) ? 1 : 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]%2==0){
                pEvenArray[i] = pEvenArray[i-1]+1;
                pOddArray[i] = pOddArray[i-1];
            }else{
                pEvenArray[i] = pEvenArray[i-1];
                pOddArray[i] = pOddArray[i-1]+1;
            }
        }
        printArrays(pEvenArray);
        printArrays(pOddArray);
        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int resEven=0, resOdd=0;

            if(left==0){
                resEven=pEvenArray[right];
                resOdd=pOddArray[right];
            }else{
                resEven += pEvenArray[right]-pOddArray[left-1];
                resOdd += pOddArray[right]-pOddArray[left-1];
            }
            System.out.println("Even numbers in an array are: "+resEven);
            System.out.println("Odd numbers in an array are: "+resOdd);
        }
    }
    public static void printArrays(int[] arr){
        for(int item : arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
