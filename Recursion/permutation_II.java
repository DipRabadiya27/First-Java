package Recursion;

import java.util.*;

public class permutation_II {
    public static void recurPermutes(int idx, int[] arr, List<List<Integer>> ans ) {
        if(idx == arr.length) {
            //copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            recurPermutes(idx+1, arr, ans);
            swap(i,idx,arr)
;
        }
    }
    public static void swap(int i, int j, int[] arr){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        recurPermutes(0, arr, ans);
        System.out.println(ans);
    }
}
