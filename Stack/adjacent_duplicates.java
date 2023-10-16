package Stack;

import java.util.Arrays;
import java.util.Stack;

public class adjacent_duplicates {
    public static void main(String[] args) {
        String s = "abccbddab";
        Stack<Character> str = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (str.isEmpty()) {
                str.push(s.charAt(i));
            } else if (str.peek() == s.charAt(i)) {
                str.pop();
            } else {
                str.push(s.charAt(i));
            }
        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}