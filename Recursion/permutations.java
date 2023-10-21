package Recursion;

import java.util.*;
public class permutations {
    public static void recurPermute(int[] arr,List<Integer> ds,List<List<Integer>> ans, boolean []freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<arr.length;i++){
            if(!freq[i]) {
                freq[i]=true;
                ds.add(arr[i]);
                recurPermute(arr, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] =  new boolean[arr.length];
        recurPermute(arr, ds, ans, freq);
        System.out.println(ans);
    }
}