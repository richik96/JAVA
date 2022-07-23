import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int sumodd []= new int[n]; 
        int sumeven []= new int[n];
        sumeven[0] = A.get(0);
        sumodd[0] = 0;
        for(int i=1;i<n;i++) {
            if(i%2 == 0) {
                sumeven[i] = sumeven[i-1] + A.get(i);
                sumodd[i] = sumodd[i-1];
            }
            else {
                sumeven[i] = sumeven[i-1];
                sumodd[i] = sumodd[i-1] + A.get(i);
            }
        }
        int c=0;
        int odd_sum = 0;
        int even_sum = 0;
        for(int i=0;i<n;i++) {
            if(i == 0) {
                odd_sum = sumeven[n-1] - sumeven[i];
                even_sum = sumeven[n-1] - sumodd[i];
            }
            else {
                odd_sum = sumodd[i-1] + (sumeven[n-1] - sumeven[i]);
                even_sum = sumeven[i-1] + (sumodd[n-1] - sumodd[i]);
            }
            if(odd_sum == even_sum)
                c++;
        }
        return c;
    }
}