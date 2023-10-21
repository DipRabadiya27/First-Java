package Recursion;
import java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Set;

public class combination_sum_II {
    public static void findCombinationOfSum(int ind, int[] arr,int target, List<List<Integer>> ans, List<Integer> ds) {
        if(ind == arr.length) {
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int i=ind; i<arr.length;i++) {
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombinationOfSum(i + 1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2};
        int target = 6;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findCombinationOfSum(0, arr, target, ans, new ArrayList<>());

        //hashSet can be converted to a list of list, then return the list
        System.out.println(ans);
    }
}
