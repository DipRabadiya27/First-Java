package Recursion;
import java.util.*;
public class subset_sum {
    public static void subset(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if(ind == N){
            sumSubset.add(sum);
            return;
        }

        subset(ind+1, sum + arr.get(ind), arr, N, sumSubset);

        subset(ind+1, sum, arr, N, sumSubset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(3);
        set.add(1);
        set.add(2);
        int N = set.size();
        ArrayList<Integer> sumSubset = new ArrayList<>();
        subset(0, 0, set, N, sumSubset);
        Collections.sort(sumSubset);
        System.out.print(sumSubset);
    }
}