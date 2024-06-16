import java.util.Arrays;

public class ElementsHavingAtLeast1ElementGreater {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 6, 3, 2, 10, 0};
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                if(arr[i]<arr[j]){
//                    count++;
//                    break;
//                }
//            }
//        }
        int count=arr.length;
        Arrays.sort(arr);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[arr.length-1]==arr[i]){
                count--;
            }
            else{
                break;
            }
        }
        System.out.println("Count: "+count);
    }
}
