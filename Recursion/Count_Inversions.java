package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Count_Inversions {

    static int count = 0;

    public static int merge(int[] arr,int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } 
            //right is smaller
            else {
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        
        while(left <=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
                right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        //return arr;
        return count;
    }
    public static int mergesort(int[] arr, int low, int high) {
        int c =0;
        if(low == high){
            return c;
        }
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid,high);
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        mergesort(arr, 0, arr.length-1);
        System.out.println(count);
    }
}