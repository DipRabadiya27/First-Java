package Recursion;

import java.util.*;

public class combination_sum {

    public static void findCombination(int ind, int[] arr,int target, List<List<Integer>> ans, List<Integer> ds) {
        if(ind == arr.length) {
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombination(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, arr, target, ans, ds);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, arr, target, ans, new ArrayList<>());
        System.out.println(ans);
    }
}