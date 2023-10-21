package Recursion;

import java.util.ArrayList;

public class count_subsequncesOfSum {
    private static int subsequenceOfSum(int ind, int s, int sum, int[] arr, int n) {
        if(s>sum) {
            return 0;
        }
        if (ind == n) {
            if (s == sum) {
                return 1;
            } else {
                return 0;
            }
        }

        s += arr[ind];

        int l = subsequenceOfSum(ind + 1, s, sum, arr, n);

        s -= arr[ind];

        int r = subsequenceOfSum(ind + 1, s, sum, arr, n);
        return l + r;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        System.out.println(subsequenceOfSum(0, 0, sum, arr, n));
    }
}