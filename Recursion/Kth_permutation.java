package Recursion;

import java.util.*;

public class Kth_permutation {
    static String getPermutation1(int n, int k) {
        int fact = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }

    static void swap(char s[], int i, int j) {
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }

    static void permutationHelper(char s[], int index, ArrayList<String> res) {
        if (index == s.length) {
            String str = new String(s);

            res.add(str);
            return;
        }
        for (int i = index; i < s.length; i++) {
            swap(s, i, index);
            permutationHelper(s, index + 1, res);
            swap(s, i, index);
        }
    }

    static String getPermutation(int n, int k) {
        String s = "";
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        permutationHelper(s.toCharArray(), 0, res);
        Collections.sort(res);

        return res.get(k);

    }

    public static void main(String[] args) {
        int n = 4;
        int k = 17;
        // int fact = 1;
        // List<Integer> numbers = new ArrayList<>();
        // for(int i=1;i<n;i++){
        // fact = fact *i;
        // numbers.add(i);
        // }
        // numbers.add(n);
        // String ans = "";
        // k = k-1;
        // while(true){
        // ans = ans + numbers.get(k/fact);
        // numbers.remove(k/fact);
        // if(numbers.size() == 0) {
        // break;
        // }
        // k = k % fact;
        // fact = fact/numbers.size();
        // }
        // System.out.println(ans);
        // int n = 3, k = 3;
        String ans = getPermutation(n, k);
        System.out.println("The Kth permutation sequence is " + ans);
    }
}