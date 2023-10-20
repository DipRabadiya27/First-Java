package Recursion;

import java.util.Arrays;

//reverse arr
public class reverse_array {

    public static void rev(int i,int arr[], int n) {
        if(i>=n/2) {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(i+1,arr,n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n=arr.length;
        rev(0,arr, n);
        System.out.println(Arrays.toString(arr));
    }
}