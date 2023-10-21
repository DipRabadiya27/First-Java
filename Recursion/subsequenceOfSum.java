package Recursion;

import java.util.ArrayList;


public class subsequenceOfSum {
    private static void subsequenceOfSum(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if(ind == n){
            if(s == sum) {
                for(int it: ds){
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[ind]);
        s +=arr[ind];

        subsequenceOfSum(ind + 1,ds,s,sum,arr,n);

        s -= arr[ind];
        ds.remove(ds.size()-1);

        subsequenceOfSum(ind+1, ds, s, sum, arr, n);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1};
        int n=3;
        int sum=2;
        ArrayList<Integer> ds=new ArrayList<Integer>();
        subsequenceOfSum(0, ds, 0, sum, arr, n);
    }

    
}