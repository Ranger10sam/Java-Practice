import java.util.Arrays;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 9};
        closestMinMax(arr);
    }
    public static void closestMinMax(int[] arr){
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        int max = arrCopy[arrCopy.length - 1];
        int min = arrCopy[0];
        int ans=Integer.MAX_VALUE, lastMax = -1, lastMin = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                lastMax = i;
            }
            if(arr[i]==min){
                lastMin = i;
            }
        }
        System.out.println(lastMax-lastMin+1);

    }
}
