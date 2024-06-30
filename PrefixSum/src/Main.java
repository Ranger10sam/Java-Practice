import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> pSum = new ArrayList<>();

        ArrayList<ArrayList<Integer>> qSum = new ArrayList<ArrayList<Integer>>();


        System.out.println("Enter no. of overs played: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the score in "+(i+1)+" overs: ");
            arr.add(sc.nextInt());
        }

        System.out.println("Enter number of queries: ");
        int n1 = sc.nextInt();
        for(int i = 0; i < n1; i++){
            System.out.println("Enter from which over to which over you want to see the score, seperated by a line: ");
            ArrayList<Integer> tempArray = new ArrayList<>();
            for(int j = 0; j < 2; j++) {
                tempArray.add(sc.nextInt()-1);
            }
            qSum.add(tempArray);
        }

        pSum.add(0, arr.get(0));
        for (int i = 1; i < n; i++) {
            pSum.add(arr.get(i)+pSum.get(i-1));
        }

        for(int i = 0; i < n1; i++){
            int left = qSum.get(i).get(0);
            int right = qSum.get(i).get(1);

            if(left==0){
                System.out.println("Runs scored between "+left+", "+right+" overs is: "+pSum.get(right));
            }else{
                System.out.println("Runs scored between "+(left+1)+", "+(right+1)+" overs is: "+(pSum.get(right)- pSum.get(left)) );
            }
        }
            // 00 01
            // 10 11
            // 20 21
    }
}
