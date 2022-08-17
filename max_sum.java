import java.util.*;


public class max_sum {
    public static void main(String[] args) {
        
        //input Array
        System.out.println("Input Arraylist :");

        Scanner sc = new Scanner(System.in);

        //setting up arraylist input
        ArrayList<Integer> A = new ArrayList<>();
        while(sc.hasNextInt()) {
            int i = sc.nextInt();
            A.add(i);
        }
        // Max sum of contiguous subarray
        System.out.println("The maximum sum of contiguous subarray : " + max_sum(A));
        //System.out.println("The maximum contiguous subarray : " + max_subarray(A));

    }

    //Sum function
    static int max_sum(ArrayList<Integer> A) {
        int n = A.size();
        int curr_sum = A.get(0);
        int sum = curr_sum;

        for(int i=1; i<n; i++) {
            curr_sum = Math.max(A.get(i), (curr_sum + A.get(i)));
            sum = Math.max(curr_sum, sum);
        }
        return sum;
    }
}
