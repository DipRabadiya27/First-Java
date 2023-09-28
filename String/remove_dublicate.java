package String;

import java.util.HashMap;

public class remove_dublicate {
    public static void main(Strings[] args) {
        String s = "dipdip";
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = "";

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])) {
                ans += arr[i];
                map.put(arr[i], 1);
            }
        }
        System.out.println(ans);
    }
}