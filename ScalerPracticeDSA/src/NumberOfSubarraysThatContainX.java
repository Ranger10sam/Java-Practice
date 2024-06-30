public class NumberOfSubarraysThatContainX {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 2, 6, 1, 2 };
        int n = arr.length;
        int ans = 0;
        int target = 6;
        int ln=-1, fn=-1;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                ln = i;
                if(fn==-1){
                    fn=i;
                }
            }
        }
        for(int i=0; i<ln; i++){
            ans += Math.min( n-fn, n-i );
            //n-i => ( (n-1)+i+1 ) = gives the number of elements from the current index i to the end of the array n
            //n-fn => ( (n-1)+fn+1 ) => gives the number of elements from the first occurrence fn to the end of the array n
            //min is used so that if we are considering the full array then we should not consider the length which contains
            //elements other than my target
            //for example in the given array we will not consider the array that is generated with only 1, 2, because we dont have my target
            //element in this range so we are taking from first occurance ()fn to n, in this case
        }
        System.out.println(ans);

    }
}
