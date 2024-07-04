public class LongestAlternatingSubarray {
    public static void main(String[] args) {
        int[] arr = {6,12,2,3,8,9,10,10,2,1};
        int x = alternatingSubarray(arr);
        System.out.println(x);
    }

    public static int alternatingSubarray(int[] nums) {
        int lengthMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int subArrayLength = 1;
            int expectedSum = nums[i] - nums[i + 1];
            if (expectedSum == -1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if( (j-i)%2!=0  && (nums[i] - nums[j] == expectedSum) ){
                        subArrayLength++;
                    }else if( (j-i)%2==0 && (nums[i] - nums[j] == 0) ){
                        subArrayLength++;
                    }else {
                        break;
                    }
                }
                lengthMax = Math.max(lengthMax, subArrayLength);
            }
        }
        return (lengthMax != 0) ? lengthMax : -1;
    }
}
