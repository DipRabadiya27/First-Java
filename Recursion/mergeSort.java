package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static int[] merge(int[] arr,int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
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
        return arr;
    }
    public static int[] mergesort(int[] arr, int low, int high) {
        if(low == high){
            return arr;
        }
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid,high);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={3,1,2,4,1,5,2,6,4};
        int low =0;
        int high=arr.length-1;
        mergesort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}